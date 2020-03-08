import java.util.Scanner

fun main() {
    println("####### Exercício 15 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite um número inteiro: ")
    val numero:Int = input.nextInt()

    print("O número é: " + checarPar(numero))
}

fun checarPar(numero:Int):String {
    if(numero % 2 == 0) return "Par"

    return "Ímpar"
}