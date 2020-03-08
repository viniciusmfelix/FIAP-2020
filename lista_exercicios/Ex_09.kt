import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    println("####### Exercício 9 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit:Double = input.nextDouble()

    val format = DecimalFormat("#.0 °C")

    print("Temperatura em Celsius: " + format.format(converterCelsius(fahrenheit)))
}

fun converterCelsius(fahrenheit:Double):Double {
    return (5 * (fahrenheit - 32))/9
}