import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    println("####### Exercício 6 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite o valor do raio do círculo para o cálculo: ")
    val raio:Double = input.nextDouble()

    val format = DecimalFormat("#,###.00")

    print("O valor da área do círculo é: " + format.format(calcularArea(raio)))
}

fun calcularArea(raio:Double):Double {
    return Math.PI * Math.pow(raio, 2.toDouble())
}
