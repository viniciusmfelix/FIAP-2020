package orientacao_objetos

class Pessoa(
    val nome:String,
    val sobrenome:String,
    val idade:Int,
    val genero:Genero
)

enum class Genero{
    MASCULINO, FEMININO
}

fun main(){

    val pessoas = listOf(
        Pessoa("Vinicius", "Felix", 20, Genero.MASCULINO),
        Pessoa("Diego", "Felix", 17, Genero.MASCULINO),
        Pessoa("Adriana", "Felix", 15, Genero.FEMININO),
        Pessoa("Eduardo", "Felix", 22, Genero.MASCULINO),
        Pessoa("Lahis", "Felix", 26, Genero.FEMININO),
        Pessoa("Marcos", "Felix", 19, Genero.MASCULINO)
    )

    val qtMasc = pessoas.filter{
        it.genero == Genero.MASCULINO
    }.size

    val qtFem = pessoas.size - qtMasc

    print("Masc: $qtMasc. Fem: $qtFem")
}