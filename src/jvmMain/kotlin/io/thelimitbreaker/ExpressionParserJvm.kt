package io.thelimitbreaker




fun main(){
    val expressionParser = ExpressionParser()

    val res = expressionParser.evaluate("1-2E-4")
    print(res)
}