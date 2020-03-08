import java.util.Scanner

fun main() {
    println("####### Exercício 13 - GitHub #######")

    val input = Scanner(System.`in`)


    do {
        print("Digite 'M' para sexo masculino e 'F' para sexo feminino: ")
        val sexo:String = input.next()

        if(!sexo.equals("m", ignoreCase = true) && !sexo.equals("f", ignoreCase = true)){
            println("Sexo inválido, digite novamente!")
        } else {
            print("O sexo digitado é: " + checarSexo(sexo))
            break
        }

    }while(!sexo.equals("m", ignoreCase = true) && !sexo.equals("f", ignoreCase = true))

}

fun checarSexo(sexo:String):String {
    if(sexo.equals("m", ignoreCase = true)) return "Masculino"

    return "Feminino"
}