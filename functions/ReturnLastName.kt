package functions

fun main() {
    val name:String = "Vinicius"
    val name1:String = "Vinicius Felix"
    val name2:String = "Vinicius Felix Teste"

    println(name.lastName())
    println(name1.lastName())
    println(name2.lastName())
}

fun String.lastName(): String {
    return this.split(' ').last()
}