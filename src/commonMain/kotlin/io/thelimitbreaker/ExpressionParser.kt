package io.thelimitbreaker

import kotlin.math.pow

class ExpressionParser {

    private enum class Operators(val sign: Char) {
        MINUS('-'),
        PLUS('+'),
        MULTIPLY('*'),
        DIVISION('/'),
        POWER('^'),
        EXPONENTIAL('E')
    }

    private fun String.split(position: Int) =
        listOf(
            this.substring(0, position),
            this.substring(position + 1, this.length)
        )

    private fun extractNumber(numString: String) = numString.toDoubleOrNull()

    private fun String.lastIndexOf(char: Char):Int{
        var bOpen = 0
        var bClose = 0
        for (i in this.indices){
            val currChar = this[i]

            when {
                currChar==char && bOpen == bClose -> return this.length - i -1
                currChar == '(' -> bOpen++
                currChar == ')' -> bClose++
            }
        }
        return -1
    }
    private fun isNumber(numString: String) = numString.toDoubleOrNull() != null

    fun evaluate(expression: String): Double {
        for (operator in Operators.values()) {

            /*
                find the operator from right side (last)
                for cases : 20/10/2
            */
            val position = expression.reversed().lastIndexOf(operator.sign)

            println("position of ${operator.sign}: $position")
            if (position > 0) {
                val partialExpressions = expression.split(position)
                val left = partialExpressions[0]
                val right = partialExpressions[1]
                println("left $left, right $right")
                val res =  when (operator) {
                    Operators.PLUS -> evaluate(left) + evaluate(right)
                    Operators.MINUS -> evaluate(left) - evaluate(right)
                    Operators.DIVISION -> evaluate(left) / evaluate(right)
                    Operators.MULTIPLY -> evaluate(left) * evaluate(right)
                    Operators.POWER -> evaluate(left).pow(evaluate(right))
                    Operators.EXPONENTIAL -> evaluate(left) * (10.0.pow(evaluate(right)))
                }
                println("res $res")
                return res
            }
        }
        if (expression.startsWith('(') && expression.endsWith(')')){
            return evaluate(expression.substring(1,expression.lastIndex))
        }
        return extractNumber(expression) ?: -1.0
    }
}