package io.kaen.dagger

import kotlin.math.*

class ExpressionParser {

    private val numStack = Stack<Double>()
    private val opStack = Stack<String>()

    private var logEnabled = false

    fun enableLog(status: Boolean) {
        logEnabled = status
    }

    fun evaluate(expression: String, precision: Int = 3): Double {
        val res = evaluateExpression(expression)
        return roundToPrecision(res, precision)
    }

    private fun roundToPrecision(value: Double, precision: Int = 3): Double {
        val corrector = 10.0.pow(precision).toInt()
        return round(value * corrector) / corrector
    }

    private fun computeBinaryOperation(op: String) {
        try {
            val num0 = numStack.pop()
            val num1 = numStack.pop()

            when (op) {
                BinaryOperators.PLUS.sign -> numStack.push(num1 + num0)
                BinaryOperators.MINUS.sign -> numStack.push(num1 - num0)
                BinaryOperators.MULTIPLY.sign -> numStack.push(num1 * num0)
                BinaryOperators.DIVISION.sign -> numStack.push(num1 / num0)
                BinaryOperators.POWER.sign -> numStack.push(num1.pow(num0))
                BinaryOperators.EXPONENTIAL.sign -> numStack.push(num1 * (10.0.pow(num0)))
            }
        } catch (es: IndexOutOfBoundsException) {
            throw BadSyntaxException()
        } catch (ae: ArithmeticException) {
            // division by zero
            throw Exception("Division by zero not possible")
        }
    }

    private fun evaluateExpression(expression: String): Double {
        var i = 0;
        var isNegative = false
        val numString = StringBuilder()
        while (i < expression.length) {
            val currChar = expression[i]

            if (currChar in "0123456789.") {
                if (i != 0 && expression[i - 1] == ')') {
                    performSafePushToStack(numString, "*", isNegative)
                }
                numString.append(currChar)
                i++

            } else if (currChar.toString() isIn BinaryOperators.values() || currChar == '(') {

                if (currChar == '(') {
                    if (i != 0 && expression[i - 1].toString() notIn BinaryOperators.values()) {
                        performSafePushToStack(numString, "*", isNegative)
                    }
                    opStack.push("(")
                } else {
                    performSafePushToStack(numString, currChar.toString(), isNegative)
                }

                // check for unary minus for case of negative number in partial right expression
                if (currChar.toString() == BinaryOperators.MINUS.sign) {
                    isNegative = when (i) {
                        0 -> true
                        else -> {
                            val prevChar = expression[i - 1]
                            prevChar in "+*/^E("
                        }
                    }
                }
                i++
            } else if (currChar == ')') {
                computeBracket(numString, isNegative)
                i++
            } else if (currChar == '!') {
                performFactorial(numString, isNegative)
                i++
            } else if (currChar == '%') {
                performPercentage(numString, isNegative)
                i++
            } else if (expression.substring(i, i + 2) == "PI") {
                numStack.push(PI)
                i += 2
            } else if (expression[i] == 'e') {
                numStack.push(E)
                i++
            } else {
                if (i != 0 && expression[i - 1].toString() notIn BinaryOperators.values()) {
                    performSafePushToStack(numString, "*", isNegative)
                }
                val increment = pushFunctionalOperator(expression, numString, isNegative, i)
                i += increment
            }
        }

        if (numString.isNotEmpty()) {
            var number = numString.toString().toDouble()
            if (isNegative) {
                number = 0 - number
            }
            numStack.push(number)
            numString.clear()
        }
        while (!opStack.isEmpty()) {
            val op = opStack.pop()
            computeBinaryOperation(op)
        }
        if (logEnabled) {
            opStack.display()
            numStack.display()
        }
        return try {
            numStack.pop()
        } catch (ie: IndexOutOfBoundsException) {
            throw BadSyntaxException()
        }
    }


    private fun pushFunctionalOperator(
        expression: String,
        numString: StringBuilder,
        isNegative: Boolean,
        index: Int
    ): Int {
        for (func in FunctionalOperators.values()) {
            val funLength = func.func.length
            if (expression.substring(index, index + funLength) == func.func) {
                if (index != 0 && expression[index - 1] == ')') {
                    performSafePushToStack(numString, "*", isNegative)
                }
                if (func != FunctionalOperators.logx) {
                    opStack.push(func.func)
                    return funLength
                } else {
                    val logRegex = Regex("log[123456789.]+\\(")
                    val found = logRegex.find(expression.substring(index, expression.length))
                    val logxString = found!!.value
                    opStack.push(logxString)
                    return logxString.length
                }
            }
        }

        throw Exception("Unsupported Operation at ${expression.substring(index, expression.length)}")
    }

    private fun performSafePushToStack(
        numString: StringBuilder,
        currOp: String,
        isNegative: Boolean
    ) {
        if (numString.isNotEmpty()) {
            var number = numString.toString().toDouble()
            if (isNegative) {
                number = 0 - number
            }
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
                        computeBinaryOperation(op)
                        if (!opStack.isEmpty())
                            prevOpPrecedence = getBinaryOperatorPrecedence(opStack.peek())
                        else
                            break
                    }
                    opStack.push(currOp)
                }
            }
        } else if (!numStack.isEmpty()) {
            opStack.push(currOp)
        }
    }

    private fun getBinaryOperatorPrecedence(currOp: String): Int {
        return when (currOp) {
            BinaryOperators.PLUS.sign -> BinaryOperators.PLUS.precedence
            BinaryOperators.MINUS.sign -> BinaryOperators.MINUS.precedence
            BinaryOperators.MULTIPLY.sign -> BinaryOperators.MULTIPLY.precedence
            BinaryOperators.DIVISION.sign -> BinaryOperators.DIVISION.precedence
            BinaryOperators.POWER.sign -> BinaryOperators.POWER.precedence
            BinaryOperators.EXPONENTIAL.sign -> BinaryOperators.EXPONENTIAL.precedence
            else -> -1
        }
    }

    private fun computeBracket(numString: StringBuilder, isNegative: Boolean) {
        if (numString.isNotEmpty()) {
            var number = numString.toString().toDouble()
            if (isNegative) {
                number = 0 - number
            }
            numStack.push(number)
            numString.clear()
        }
        var operator = opStack.pop()
        while (operator != "(" && !(operator isIn FunctionalOperators.values())
        ) {
            computeBinaryOperation(operator)
            operator = opStack.pop()
        }
        if (operator isIn FunctionalOperators.values()) {
            computeFunction(operator)
        }
    }

    private fun computeFunction(func: String) {
        val num = numStack.pop()
        when (func) {
            FunctionalOperators.sin.func -> numStack.push(sin(num))
            FunctionalOperators.cos.func -> numStack.push(cos(num))
            FunctionalOperators.tan.func -> numStack.push(tan(num))
            FunctionalOperators.asin.func -> numStack.push(asin(num))
            FunctionalOperators.acos.func -> numStack.push(acos(num))
            FunctionalOperators.atan.func -> numStack.push(atan(num))
            FunctionalOperators.sinh.func -> numStack.push(sinh(num))
            FunctionalOperators.cosh.func -> numStack.push(cosh(num))
            FunctionalOperators.tanh.func -> numStack.push(tanh(num))
            FunctionalOperators.sqrt.func -> numStack.push(sqrt(num))
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

    private fun performFactorial(numString: StringBuilder, isNegative: Boolean) {
        if (numString.isNotEmpty()) {
            val number = numString.toString().toDouble()
            numString.clear()
            if (number.isInt()) {
                var result = factorial(number.toInt())
                if (isNegative) {
                    result = 0 - result
                }
                numStack.push(result.toDouble())
            } else {
                throw DomainException()
            }
        } else if (!numStack.isEmpty()) {
            val number = numStack.pop()
            if (number.isInt()) {
                var result = factorial(number.absoluteValue.toInt())
                if (number < 0) {
                    result = 0 - result
                }
                numStack.push(result.toDouble())
            } else {
                throw DomainException()
            }
        }
    }


    private fun performPercentage(numString: StringBuilder, isNegative: Boolean) {
        if (numString.isNotEmpty()) {
            var number = numString.toString().toDouble()
            if (isNegative) {
                number = 0 - number
            }
            numString.clear()
            val result = number / 100
            numStack.push(result)

        } else if (!numStack.isEmpty()) {
            val number = numStack.pop()
            val result = number / 100.0
            numStack.push(result)
        }
    }

    private fun Double.isInt() = this == floor(this)

    private fun factorial(num: Int, output: Int = 1): Int {
        return if (num == 0) output
        else factorial(num - 1, output * num)
    }

}