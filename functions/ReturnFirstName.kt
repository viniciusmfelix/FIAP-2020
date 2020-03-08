package functions

fun main() {
    val name:String = "Vinicius"
    val name1:String = "Vinicius Felix"
    val name2:String = "Vinicius Felix Teste"

    println(name.firstName())
    println(name1.firstName())
    println(name2.firstName())
}

fun String.firstName(): String {
    return this.split(' ').first()
}