import java.util.Scanner

fun main() {
    println("####### Exercício 3 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite o primeiro número para soma: ")
    val numeroA:Int = input.nextInt()

    print("Digite o segundo número para soma: ")
    val numeroB:Int = input.nextInt()

    print("O resultado da soma é: " + soma(numeroA, numeroB))
}

fun soma(numeroA:Int, numeroB:Int):Int {
    return numeroA + numeroB
}