package functions

import java.text.NumberFormat

data class BankAccount(val bank:String, val balance: Double? = null)

fun main(){
    val banks = listOf(
        BankAccount("Itau", 200.0),
        BankAccount("Banco do Brasil", 0.0),
        BankAccount("Bradesco"),
        BankAccount("Nu Bank", 500.0),
        BankAccount("Neon", null)
    )

    banks.forEach {
        it.let {
            val myBank = it.bank
            it.balance?.let {
                println("O Banco ${myBank} possui um rendimento de ${it.bankToCurrencyFormat()}")
            }
        }
    }
}

fun Double.bankToCurrencyFormat(): String {
    return NumberFormat.getCurrencyInstance().format(this);
}