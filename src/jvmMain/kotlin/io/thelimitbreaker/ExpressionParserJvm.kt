package io.thelimitbreaker




fun main(){
    val expressionParser = ExpressionParser()

    val res = expressionParser.evaluate("20/10/2")
    print(res)
}