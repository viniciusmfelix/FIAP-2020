package orientacao_objetos

class Macaco(val nome:String, val estomago:MutableList<String>){
    fun comer(alimento:String){
        this.estomago.add(alimento)
    }

    fun verEstomago():List<String> {
        return this.estomago
    }

    fun digerir() {
        estomago.removeAll(this.estomago)
    }
}

fun main() {

    val listaAlimentos = mutableListOf<String>("Banana", "Maçã")

    val m1 = Macaco("Vagabundo", listaAlimentos)

    println(m1.estomago)

    m1.digerir()

    println(m1.estomago)

    m1.comer("Abacaxi")

    println(m1.estomago)

    m1.digerir()

    println(m1.estomago)

}