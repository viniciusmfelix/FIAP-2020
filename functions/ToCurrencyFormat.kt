package functions

import java.text.NumberFormat

fun main() {
    val valor:Double = 40.0
    print(valor.toCurrencyFormat())
}

fun Double.toCurrencyFormat(): String {
    return NumberFormat.getCurrencyInstance().format(this);
}