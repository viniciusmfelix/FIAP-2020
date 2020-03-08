import java.util.Scanner

fun main() {
    println("####### Exercício 7 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite um lado do quadrado: ")
    val lado:Double = input.nextDouble()

    print("Dobro do valor da área calculada: " + calcularLado(lado))
}

fun calcularLado(lado:Double): Double {
    return Math.pow(Math.pow(lado, 2.toDouble()), 2.toDouble())
}