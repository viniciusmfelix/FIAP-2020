package orientacao_objetos

sealed class Formula(){
    class Soma : Formula()
    class Subtracao : Formula()

    fun resolverFormula(operacao:Formula, n1:Int, n2:Int): Int{
        if(operacao is Formula.Soma){
            return n1 + n2
        }
        return n1 - n2
    }
}

fun main() {

    val operacao = Formula.Soma()
    val resultado = operacao.resolverFormula(operacao, 2, 2)

    print(resultado)
}