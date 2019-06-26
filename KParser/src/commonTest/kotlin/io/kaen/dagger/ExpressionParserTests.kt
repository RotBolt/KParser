package io.kaen.dagger

import kotlin.math.*
import kotlin.test.*

class ExpressionParserTests {

    val expressionParser = ExpressionParser()

    private fun roundToPrecision(value: Double, precision: Int = 3): Double {
        val corrector = 10.0.pow(precision).toInt()
        return round(value * corrector) / corrector
    }

    private fun factorial(num: Int, output: Int = 1): Int {
        return if (num == 0) output
        else factorial(num - 1, output * num)
    }

    @Test
    fun simpleAdd() {
        val result = expressionParser.evaluate("1+3")
        assertEquals(4.0, result)
    }

    @Test
    fun divide() {
        val result = expressionParser.evaluate("4/5")
        assertEquals(4 / 5.0, result)
    }

    @Test
    fun subtract() {
        val result = expressionParser.evaluate("10-9-9")
        assertEquals(-8.0, result)
    }

    @Test
    fun simpleUnaryMinus() {
        val result = expressionParser.evaluate("-9")
        assertEquals(-9.0, result)
    }

    @Test
    fun negativeAdd() {
        val result = expressionParser.evaluate("-9-9.6")
        assertEquals(-18.6, result)
    }

    @Test
    fun positiveDivisionByZero() {
        val result = expressionParser.evaluate("9/0")
        assertEquals(Double.POSITIVE_INFINITY, result)
    }

    @Test
    fun negativeDivisionByZero() {
        val result = expressionParser.evaluate("-9.0/0")
        assertEquals(Double.NEGATIVE_INFINITY, result)
    }

    @Test
    fun logXTest() {
        val result = expressionParser.evaluate("log12(50)")
        val precised = roundToPrecision(log(50.0, 12.0))
        assertEquals(precised, result)
    }

    @Test
    fun complexLogXFactorialBracMultiply() {
        val result = expressionParser.evaluate("(10*log2(2))!")
        val precisesd = roundToPrecision(factorial((10 * log2(2.0).toInt())).toDouble())
        assertEquals(precisesd, result)
    }

    @Test
    fun chainedDivision() {
        val result = expressionParser.evaluate("20/10/2")
        assertEquals(1.0, result)
    }

    @Test
    fun simpleSinh() {
        val result = expressionParser.evaluate("sinh(PI)")
        val precised = roundToPrecision(sinh(PI))
        assertEquals(precised, result)
    }

    @Test
    fun simplePercent() {
        val result = expressionParser.evaluate("1-6%")
        assertEquals(1 - 0.06, result)
    }

    @Test
    fun simpleUnaryFunction() {
        val result = expressionParser.evaluate("-cos(PI)")
        assertEquals(-cos(PI), result)
    }

    @Test
    fun complexUnaryCase() {
        val result = expressionParser.evaluate("2*-(-cos(PI))")
        assertEquals(-2.0, result)
    }

    @Test
    fun evalInDegrees() {
        expressionParser.isDegrees = true
        val result = expressionParser.evaluate("sin(90)")
        assertEquals(1.0, result)
        val result2 = expressionParser.evaluate("sin(30)")
        assertEquals(0.5, result2)
    }

    @Test
    fun simpleExpTest() {
        expressionParser.isDegrees = true
        val result = expressionParser.evaluate("exp(cos(90))")
        assertEquals(1.0, result)
    }

    @Test
    fun funcInFunc() {
        expressionParser.isDegrees = true
        val result = expressionParser.evaluate("e^2+exp(cos(90))")
        assertEquals(8.389, result)
    }

}