package io.kaen.dagger

import kotlin.math.*

class DeprecateParser {

    private enum class Operators(val sign: Char) {
        PLUS('+'),
        MINUS('-'),
        MULTIPLY('*'),
        DIVISION('/'),
        POWER('^'),
        EXPONENTIAL('E');
    }

    private fun String.split(position: Int) =
        listOf(
            this.substring(0, position),
            this.substring(position + 1, this.length)
        )

    private fun extractNumber(numString: String) = numString.toDoubleOrNull()

    private fun isValue(expression: String): Boolean {
        val validChars = "1234567890.-"

        for (i in expression.indices) {
            val char = expression[i]
            if (char !in validChars) return false
            if (expression.count { it == '.' } > 1) return false
            if (char == '-' && i != 0) return false
        }
        return true
    }

    private fun String.lastIndexOf(char: Char): Int {
        var bOpen = 0
        var bClose = 0
        for (i in this.indices) {
            val currChar = this[i]

            when {
                currChar == char && bOpen == bClose -> return this.length - i - 1
                currChar == '(' -> bOpen++
                currChar == ')' -> bClose++
            }
        }
        return -1
    }

    private fun isOperator(operator: Operators, expression: String, position: Int): Boolean {
        if (operator == Operators.PLUS) {
            if (expression[position - 1] == 'E') {
                if (position >= 2) {
                    return false
                }
            } else {
                return true
            }
        } else if (operator == Operators.MINUS) {
            if (position == 0) {
                return false
            } else if (expression[position - 1] == 'E' && position >= 2) {
                return false
            } else {
                val prevOperator = expression[position - 1]
                for (legalOp in Operators.values()) {
                    if (prevOperator == legalOp.sign)
                        return false
                }
                println("returning operator minus")
                return true
            }
        }
        return true
    }

    private fun evaluateFunction(funString: String, value: Double): Double {
        return when (funString) {
            // Trigonometric
            "SIN", "sin", "Sin" -> sin(value)
            "COS", "cos", "Cos" -> cos(value)
            "TAN", "tan", "Tan" -> tan(value)
            "ASIN", "asin" -> asin(value)
            "ACOS", "acos" -> acos(value)
            "ATAN", "atan" -> atan(value)

            //arithmetic
            "LOG10", "log10", "Log10" -> log10(value)
            "LN", "Ln", "ln" -> ln(value)
            "SQRT", "sqrt", "Sqrt" -> sqrt(value)
            "EXP", "exp", "Exp" -> exp(value)

            //hyperbolic
            "SINH", "sinh", "Sinh" -> sinh(value)
            "COSH", "cosh", "Cosh" -> cosh(value)
            "TANH", "tanh", "Tanh" -> tanh(value)


            else -> throw
            ArithmeticException("Function cannot be determined $funString")
        }
    }

    private fun roundToPrecision(value: Double, precision: Int = 3): Double {
        val corrector = 10.0.pow(precision).toInt()
        return round(value * corrector) / corrector
    }

    fun evaluateExpression(expression: String, precision: Int = 3): Double {
        val res = evaluate(expression)
        return roundToPrecision(res, precision)
    }

    private fun evaluate(expression: String): Double {
        for (operator in Operators.values()) {
            /*
                find the operator from right side (last)
                for cases : 20/10/2
            */
            var position = expression.reversed().lastIndexOf(operator.sign)
            println("op ${operator.sign} pos $position")

            while (position > 0) {
                if (isOperator(operator, expression, position)) {
                    val partialExpressions = expression.split(position)
                    val left = partialExpressions[0]
                    val right = partialExpressions[1]

                    val value0 = evaluate(left)
                    val value1 = evaluate(right)

                    println(
                        """
                        left $left
                        right $right

                        valueLeft $value0
                        valueRight $value1
                    """.trimIndent()
                    )

                    val res = when (operator) {
                        Operators.PLUS -> value0 + value1
                        Operators.MINUS -> value0 - value1
                        Operators.DIVISION -> {
                            if (value1 == 0.0)
                                throw ArithmeticException("Divide By Zero")
                            value0 / value1
                        }
                        Operators.MULTIPLY -> value0 * value1
                        Operators.POWER -> value0.pow(value1)
                        Operators.EXPONENTIAL -> value0 * (10.0.pow(value1))
                    }
                    return res
                }
                if (position > 0) {
                    position =
                        expression.substring(0, position).reversed().lastIndexOf(operator.sign)
                }
            }
        }

        // Checking for function in expression
        val position = expression.lastIndexOf('(')
        println("Expression $expression pos $position ${expression.lastIndex}")

        if (position > 0 && expression.last() == ')') {
            val funString = expression.substring(0, position)
            val value = evaluate(expression.substring(position + 1, expression.lastIndex))
            val res = evaluateFunction(funString, value)
            return res
        }

        if (expression.startsWith('(') && expression.endsWith(')')) {
            return evaluate(expression.substring(1, expression.lastIndex))
        }
        println("Expression : $expression")
        return when {
            isValue(expression) -> extractNumber(expression) ?: Double.MIN_VALUE
            expression == "PI" -> PI
            expression == "E" || expression == "e" -> E
            else -> throw NumberFormatException()
        }
    }
}