import java.util.Scanner

fun main() {
    println("####### Exercício 12 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite o número para checagem: ")
    val numero:Double = input.nextDouble()

    print("O número é: " + checarPositivo(numero))
}

fun checarPositivo(numero:Double):String {
    if(numero < 0) return "Negativo"

    return "Positivo"
}