package io.thelimitbreaker


fun main(){
    val expressionParser = ExpressionParser()

    val res = expressionParser.evaluateExpression("1+9.089789+4.672289",precision = 5)
    print(res)
}