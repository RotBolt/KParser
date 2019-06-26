package io.kaen.dagger

import kotlin.math.*

class ExpressionParser {

    private val numStack = Stack<Double>()
    private val opStack = Stack<String>()

    var isDegrees = false
    private var logEnabled = false


    fun enableLog(status: Boolean) {
        logEnabled = status
    }

    fun evaluate(expression: String, precision: Int = 3): Double {
        val uExpression = convertToUExpression(expression)
        val res = evaluateExpression(uExpression)
        return roundToPrecision(res, precision)
    }

    private fun convertToUExpression(expression: String): String {
        val sb = StringBuilder()
        for (i in expression.indices) {
            val currChar = expression[i]
            if (currChar.toString() == NormalOperators.MINUS.sign) {
                if (i == 0) {
                    sb.append('u')
                } else {
                    val prevChar = expression[i - 1]
                    if (prevChar in "+*/^E(") {
                        sb.append('u')
                    } else {
                        sb.append(currChar)
                    }
                }
            } else {
                sb.append(currChar)
            }
        }
        return sb.toString()
    }

    private fun roundToPrecision(value: Double, precision: Int = 3): Double {
        val corrector = 10.0.pow(precision).toInt()
        var result = round(value * corrector) / corrector
        if (result == -0.0) {
            result = 0.0
        }
        return result
    }


    private fun computeNormalOperation(op: String) {
        try {
            when (op) {
                NormalOperators.PLUS.sign -> {
                    val num0 = numStack.pop()
                    val num1 = numStack.pop()
                    numStack.push(num1 + num0)
                }
                NormalOperators.MINUS.sign -> {
                    val num0 = numStack.pop()
                    val num1 = numStack.pop()
                    numStack.push(num1 - num0)
                }
                NormalOperators.MULTIPLY.sign -> {
                    val num0 = numStack.pop()
                    val num1 = numStack.pop()
                    numStack.push(num1 * num0)
                }
                NormalOperators.DIVISION.sign -> {
                    val num0 = numStack.pop()
                    val num1 = numStack.pop()
                    numStack.push(num1 / num0)
                }
                NormalOperators.POWER.sign -> {
                    val num0 = numStack.pop()
                    val num1 = numStack.pop()
                    numStack.push(num1.pow(num0))
                }
                NormalOperators.EXPONENTIAL.sign -> {
                    val num0 = numStack.pop()
                    val num1 = numStack.pop()
                    numStack.push(num1 * (10.0.pow(num0)))
                }
                NormalOperators.UNARY.sign -> {
                    val num0 = numStack.pop()
                    numStack.push(-1.0 * num0)
                }
            }
        } catch (es: IndexOutOfBoundsException) {
            clearStacks()
            throw BadSyntaxException()
        } catch (ae: ArithmeticException) {
            // division by zero
            clearStacks()
            throw Exception("Division by zero not possible")
        }
    }

    private fun evaluateExpression(expression: String): Double {
        var i = 0;
        val numString = StringBuilder()
        while (i < expression.length) {
            val currChar = expression[i]
            if (currChar in "0123456789.") {
                // check for implicit multiply
                if (i != 0 &&
                    (expression[i - 1] == ')' || expression[i - 1] == 'e' ||
                            (i >= 2 && expression.substring(i - 2, i) == "PI"))
                ) {
                    performSafePushToStack(numString, "*")
                }
                numString.append(currChar)
                i++

            } else if (currChar.toString() isIn NormalOperators.values() || currChar == '(') {

                if (currChar == '(') {
                    // check for implicit multiply
                    if (i != 0 && expression[i - 1].toString() notIn NormalOperators.values()) {
                        performSafePushToStack(numString, "*")
                    }
                    opStack.push("(")
                } else {
                    performSafePushToStack(numString, currChar.toString())
                }

                i++
            } else if (currChar == ')') {
                computeBracket(numString)
                i++
            } else if (currChar == '!') {
                performFactorial(numString)
                i++
            } else if (currChar == '%') {
                performPercentage(numString)
                i++
            } else if (i + 2 <= expression.length && expression.substring(i, i + 2) == "PI") {
                // check for implicit multiply
                if (i != 0 && expression[i - 1].toString() notIn NormalOperators.values()
                    && expression[i - 1] != '('
                ) {
                    performSafePushToStack(numString, "*")
                }
                numStack.push(PI)
                i += 2
            } else if (expression[i] == 'e' &&
                (i + 1 == expression.length || (i + 1) < expression.length && expression[i + 1] != 'x')
            ) {
                // check for implicit multiply
                if (i != 0 && expression[i - 1].toString() notIn NormalOperators.values()
                    && expression[i - 1] != '('
                ) {
                    performSafePushToStack(numString, "*")
                }
                numStack.push(E)
                i++
            } else {
                // check for implicit multiply
                if (i != 0 && expression[i - 1].toString() notIn NormalOperators.values()
                    && expression[i - 1] != '('
                ) {
                    performSafePushToStack(numString, "*")
                }
                val increment = pushFunctionalOperator(expression, i)
                i += increment
            }
        }

        if (numString.isNotEmpty()) {
            val number = numString.toString().toDouble()
            numStack.push(number)
            numString.clear()
        }
        while (!opStack.isEmpty()) {
            val op = opStack.pop()
            if (op isIn FunctionalOperators.values()) {
                clearStacks()
                throw BadSyntaxException()
            }
            computeNormalOperation(op)
        }
        if (logEnabled) {
            opStack.display()
            numStack.display()
        }
        return try {
            numStack.pop()
        } catch (ie: IndexOutOfBoundsException) {
            clearStacks()
            throw BadSyntaxException()
        }
    }


    private fun pushFunctionalOperator(
        expression: String,
        index: Int
    ): Int {
        for (func in FunctionalOperators.values()) {
            val funLength = func.func.length
            if ((index + funLength < expression.length) &&
                expression.substring(index, index + funLength) == func.func
            ) {
                if (func != FunctionalOperators.logx) {
                    opStack.push(func.func)
                    return funLength
                } else {
                    val logRegex = Regex("log[0123456789.]+\\(")
                    val found = logRegex.find(expression.substring(index, expression.length))
                    try {
                        val logxString = found!!.value
                        opStack.push(logxString)
                        return logxString.length
                    }catch (e: NullPointerException){
                        throw BaseNotFoundException()
                    }
                }
            }
        }
        clearStacks()
        throw Exception("Unsupported Operation at ${expression.substring(index, expression.length)}")
    }

    private fun performSafePushToStack(
        numString: StringBuilder,
        currOp: String
    ) {
        if (numString.isNotEmpty()) {
            val number = numString.toString().toDouble()
            numStack.push(number)
            numString.clear()

            if (opStack.isEmpty()) {
                opStack.push(currOp)
            } else {
                var prevOpPrecedence = getBinaryOperatorPrecedence(opStack.peek())
                val currOpPrecedence = getBinaryOperatorPrecedence(currOp)
                if (currOpPrecedence > prevOpPrecedence) {
                    opStack.push(currOp)
                } else {
                    while (currOpPrecedence <= prevOpPrecedence) {
                        val op = opStack.pop()
                        computeNormalOperation(op)
                        if (!opStack.isEmpty())
                            prevOpPrecedence = getBinaryOperatorPrecedence(opStack.peek())
                        else
                            break
                    }
                    opStack.push(currOp)
                }
            }
        } else if (!numStack.isEmpty() || currOp == NormalOperators.UNARY.sign) {
            opStack.push(currOp)
        }

    }

    private fun getBinaryOperatorPrecedence(currOp: String): Int {
        return when (currOp) {
            NormalOperators.PLUS.sign -> NormalOperators.PLUS.precedence
            NormalOperators.MINUS.sign -> NormalOperators.MINUS.precedence
            NormalOperators.MULTIPLY.sign -> NormalOperators.MULTIPLY.precedence
            NormalOperators.DIVISION.sign -> NormalOperators.DIVISION.precedence
            NormalOperators.POWER.sign -> NormalOperators.POWER.precedence
            NormalOperators.EXPONENTIAL.sign -> NormalOperators.EXPONENTIAL.precedence
            NormalOperators.UNARY.sign -> NormalOperators.UNARY.precedence
            else -> -1
        }
    }

    private fun computeBracket(numString: StringBuilder) {
        if (numString.isNotEmpty()) {
            val number = numString.toString().toDouble()
            numStack.push(number)
            numString.clear()
        }
        var operator = opStack.pop()
        while (operator != "(" && operator notIn FunctionalOperators.values()) {
            computeNormalOperation(operator)
            operator = opStack.pop()
        }
        if (operator isIn FunctionalOperators.values()) {
            computeFunction(operator)
        }
    }

    private fun computeFunction(func: String) {
        var num = numStack.pop()

        when (func) {
            FunctionalOperators.sin.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(sin(num))
            }
            FunctionalOperators.cos.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(cos(num))
            }
            FunctionalOperators.tan.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(tan(num))
            }
            FunctionalOperators.asin.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(asin(num))
            }
            FunctionalOperators.acos.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(acos(num))
            }
            FunctionalOperators.atan.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(atan(num))
            }
            FunctionalOperators.sinh.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(sinh(num))
            }
            FunctionalOperators.cosh.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(cosh(num))
            }
            FunctionalOperators.tanh.func -> {
                if (isDegrees) {
                    num = (num * PI) / 180
                }
                numStack.push(tanh(num))
            }
            FunctionalOperators.sqrt.func -> {
                if (num < 0) {
                    clearStacks()
                    throw ImaginaryException()
                }
                numStack.push(sqrt(num))
            }
            FunctionalOperators.exp.func -> numStack.push(exp(num))
            FunctionalOperators.ln.func -> numStack.push(ln(num))
            FunctionalOperators.log2.func -> numStack.push(log2(num))
            FunctionalOperators.log10.func -> numStack.push(log10(num))
            else -> {
                if (func.contains(FunctionalOperators.logx.func)) {
                    val base = func.substring(3, func.lastIndex).toDouble()
                    numStack.push(log(num, base))
                }
            }
        }
    }

    private fun performFactorial(numString: StringBuilder) {
        if (numString.isNotEmpty()) {
            val number = numString.toString().toDouble()
            numString.clear()
            if (number.isInt()) {
                val result = factorial(number)
                numStack.push(result)
                return
            } else {
                clearStacks()
                throw DomainException()
            }
        } else if (!numStack.isEmpty()) {
            val number = numStack.pop()
            if (number.isInt()) {
                var result = factorial(number.absoluteValue)
                if (number < 0) {
                    result = 0 - result
                }
                numStack.push(result)
                return
            } else {
                clearStacks()
                throw DomainException()
            }
        }
        clearStacks()
        throw DomainException()
    }


    private fun performPercentage(numString: StringBuilder) {
        if (numString.isNotEmpty()) {
            val number = numString.toString().toDouble()
            numString.clear()
            val result = number / 100
            numStack.push(result)
            return

        } else if (!numStack.isEmpty()) {
            val number = numStack.pop()
            val result = number / 100.0
            numStack.push(result)
            return
        }
        clearStacks()
        throw BadSyntaxException()
    }

    private fun Double.isInt() = this == floor(this)

    private fun clearStacks() {
        numStack.clear()
        opStack.clear()
    }

    private fun factorial(num: Double, output: Double = 1.0): Double {
        return if (num == 0.0) output
        else factorial(num - 1, output * num)
    }

}