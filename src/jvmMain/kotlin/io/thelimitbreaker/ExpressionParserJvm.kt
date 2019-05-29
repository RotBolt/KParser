package io.thelimitbreaker

import kotlin.math.PI


fun main(){
    val expressionParser = ExpressionParser()

    val res = expressionParser.evaluate("1+sin(PI)")
    print(res)
}