import java.util.Scanner

fun main() {
    println("####### Exercício 11 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite o primeiro número para verificação: ")
    val numeroA:Double = input.nextDouble()

    print("Digite o segundo número para verificação: ")
    val numeroB:Double = input.nextDouble()

    if(numeroA == numeroB) {
        print("Os números são de mesmo valor!")
    } else {
        print("O maior número entre estes é: " + checarMaior(numeroA, numeroB))
    }
}

fun checarMaior(numeroA:Double, numeroB:Double):Double {
    if(numeroA > numeroB){
        return numeroA
    }

    return numeroB
}