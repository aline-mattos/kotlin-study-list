package ex6

//Create a class "ContaBancaria" with the attributes "saldo" and "limite".
// Add a method called "saque" that takes a value as a parameter and subtracts it from the account balance.
// If the withdrawal amount (saque) is greater than the account balance (saldo),
// the method must throw an exception with the message "Saldo insuficiente".

class ContaBancaria(var saldo: Double, var limite: Double) {

    fun saque(valor: Double) {
        if (valor > saldo + limite) {
            throw SaldoInsuficienteException("Saque de R$ $valor inválido. Saldo insuficiente!")
        } else {
            saldo -= valor
            println("Saque de R$ $valor realizado com sucesso. Saldo atual: $saldo")
        }
    }
}

class SaldoInsuficienteException(message: String) : Exception(message)

fun main() {
    val conta = ContaBancaria(1000.0, 500.0)

    try {
        conta.saque(800.0)
        conta.saque(800.0) // throws the "Saldo insuficiente" exception
    } catch (e: SaldoInsuficienteException) {
        println(e.message)
    }
}