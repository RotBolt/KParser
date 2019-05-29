package io.thelimitbreaker

import kotlin.math.pow

class ExpressionParser {

    private enum class Operators(val sign: Char) {
        MINUS('-'),
        PLUS('+'),
        MULTIPLY('*'),
        DIVISION('/'),
        POWER('^'),
        EXPONENTIAL('E');

        fun signs(): Char {
            return sign
        }
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

    private fun isOperator(operator: Operators,expression: String,position: Int):Boolean{
        if (operator == Operators.PLUS){
                if (expression[position-1]=='E'){
                    if (position>=2){
                        return false
                    }
                }else{
                    return true
                }
        }else if(operator == Operators.MINUS){
            if (position==0){
                return false
            }else if (expression[position-1] =='E' && position >=2 ){
                return false
            }else{
                val prevOperator = expression[position-1]
                for (legalOp in Operators.values()){
                    if (prevOperator == legalOp.sign)
                        return false
                }
                return true
            }
        }
        return true
    }

    fun evaluate(expression: String): Double {
        for (operator in Operators.values()) {

            /*
                find the operator from right side (last)
                for cases : 20/10/2
            */
            var position = expression.reversed().lastIndexOf(operator.sign)

            println("position of ${operator.sign}: $position")
            while(position > 0) {
                if (isOperator(operator,expression,position)) {
                    val partialExpressions = expression.split(position)
                    val left = partialExpressions[0]
                    val right = partialExpressions[1]
                    println("left $left, right $right")
                    val res = when (operator) {
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
                if (position>0){
                    position = expression.substring(0,position).reversed().lastIndexOf(operator.sign)
                }
            }
        }
        if (expression.startsWith('(') && expression.endsWith(')')){
            return evaluate(expression.substring(1,expression.lastIndex))
        }
        println("number formed ${extractNumber(expression)}")
        return extractNumber(expression) ?: -1.0
    }
}