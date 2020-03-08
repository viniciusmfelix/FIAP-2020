import java.util.Scanner

fun main() {
    println("####### Exercício 4 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite a primeira média bimestral: ")
    val mediaA:Double = input.nextDouble()

    print("Digite a segunda média bimestral: ")
    val mediaB:Double = input.nextDouble()

    print("Digite a terceira média bimestral: ")
    val mediaC:Double = input.nextDouble()

    print("Digite a quarta média bimestral: ")
    val mediaD:Double = input.nextDouble()

    print("A média total é: " + calcularMedia(mediaA, mediaB, mediaC, mediaD))
}

fun calcularMedia(mediaA:Double, mediaB:Double, mediaC:Double, mediaD:Double):Double {
    return (mediaA + mediaB + mediaC + mediaD)/4
}