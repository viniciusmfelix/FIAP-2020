import java.util.Scanner

fun main(){
    println("####### Exercício 14 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite a letra desejada para verificação de vogal e consoante: ")
    val letra:Char = input.next().single()

    print(checarVogais(letra))
}

fun checarVogais(letra:Char):String {
    val vogais = listOf("a", "e", "i", "o", "u")

    var valid:Boolean = false

    vogais.forEach{
        val itChar:CharArray = it.toCharArray()
        if(letra.equals(itChar[0], ignoreCase = true)) valid = true
    }

    if(valid == true) return "Vogal"
    else if(valid == false && letra.isLetter()) return "Consoante"

    return "Não é uma letra válida."

}