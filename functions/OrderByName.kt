package functions

data class User(val id:Int,val name:String)

fun main() {
    val inputList = listOf(User(1, "Vinicius"), User(2, "Eduardo"), User(3, "Adriana"))

    print(ordenar(inputList))
}

fun ordenar(users:List<User>): List<User> {
    return users.sortedBy { it.name }
}