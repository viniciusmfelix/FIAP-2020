import java.util.Scanner

fun main() {
    println("####### Exercício 5 - GitHub #######")

    val input = Scanner(System.`in`)

     do {

         print("Digite 'm' para converter de metros para centímetros ou 'cm' para converter centímetros para metros: ")
         val opcao:String = input.next()

         if(opcao.equals("m", ignoreCase = true)) {
             print("Digite a qt. de metros para conversão em cm: ")
             val metragem:Double = input.nextDouble()
             print("A metragem em cm de " + metragem + " metros é: " + metrosParaCm(metragem) + "cm")
         } else if (opcao.equals("cm", ignoreCase = true)) {
             print("Digite a qt. de cm para conversão em m: ")
             val metragem:Double = input.nextDouble()
             print("A metragem em m de " + metragem + " centímetros é: " + cmParaMetros(metragem))
         }
     } while(!opcao.equals("m", ignoreCase = true) && !opcao.equals("cm", ignoreCase = true))
}

fun metrosParaCm(medida:Double):Double {
    return medida*100
}

fun cmParaMetros(medida:Double):Double {
    return medida/100
}