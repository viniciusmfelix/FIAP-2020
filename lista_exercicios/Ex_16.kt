import java.util.Scanner

fun main() {
    println("####### Exercício 16 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Telefonou para a vítima? 's' para sim e 'n' para não: ")
    val respA:Char = input.next().single()

    print("Esteve no local do crime? 's' para sim e 'n' para não: ")
    val respB:Char = input.next().single()

    print("Mora perto da vítima? 's' para sim e 'n' para não: ")
    val respC:Char = input.next().single()

    print("Devia para a vítima? 's' para sim e 'n' para não: ")
    val respD:Char = input.next().single()

    print("Já trabalhou com a vítima? 's' para sim e 'n' para não: ")
    val respE:Char = input.next().single()

    print(checarCrime(respA, respB, respC, respD, respE))
}

fun checarCrime(respA:Char, respB:Char, respC:Char, respD:Char, respE:Char):String {
    var count:Int = 0

    if(respA.equals('s', ignoreCase = true)) count += 1
    if(respB.equals('s', ignoreCase = true)) count += 1
    if(respC.equals('s', ignoreCase = true)) count += 1
    if(respD.equals('s', ignoreCase = true)) count += 1
    if(respE.equals('s', ignoreCase = true)) count += 1

    if(count == 0) return "Inocente!"
    else if(count >= 2 && count < 3) return "Suspeito!"
    else if(count >=3 && count <= 4) return "Cúmplice!"
    else return "Assassino!"
}