package io.kaen.dagger

enum class BinaryOperators(val sign: String, val precedence: Int) {
    PLUS("+", 2),
    MINUS("-", 2),
    MULTIPLY("*", 3),
    DIVISION("/", 4),
    POWER("^", 5),
    EXPONENTIAL("E", 5);
}

enum class FunctionalOperators(val func: String) {
    sin("sin("),
    cos("cos("),
    tan("tan("),
    asin("asin("),
    acos("acos("),
    atan("atan("),
    sinh("sinh("),
    cosh("cosh("),
    tanh("tanh("),
    logx("log"),
    log2("log2("),
    log10("log10("),
    ln("ln("),
    sqrt("sqrt("),
    exp("exp(")

}

infix fun <T> String.isIn(operators: Array<T>): Boolean {

    for (operator in operators) {
        if (operator is BinaryOperators) {
            if (this == operator.sign) {
                return true
            }
        } else if (operator is FunctionalOperators) {
            if (this == operator.func) {
                return true
            } else if (this.contains(FunctionalOperators.logx.func)) {
                return true
            }
        }
    }
    return false
}



