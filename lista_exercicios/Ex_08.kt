import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    println("####### Exercício 8 - GitHub #######")

    val input = Scanner(System.`in`)

    print("Digite o valor da sua hora: ")
    val hora:Double = input.nextDouble()

    print("Digite a quantidade de dias trabalhados: ")
    val dias:Double = input.nextDouble()

    val format = DecimalFormat("R$ #,###.00")

    print("Valor do salário: " + format.format(calcularSalario(hora, dias)))
}

fun calcularSalario(hora:Double, dias:Double):Double {
    return (hora*8)*dias
}