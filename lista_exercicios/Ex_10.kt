import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    println("####### Exercício 10 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite o valor em Celsius: ")
    val celsius:Double = input.nextDouble()

    val format = DecimalFormat(" #.0 °F")

    print("Valor em graus fahrenheit: " + format.format(converterFahrenheit(celsius)))
}

fun converterFahrenheit(celsius:Double): Double {
    return (celsius * (9/5)) + 32
}