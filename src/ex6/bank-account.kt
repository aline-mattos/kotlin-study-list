package ex6



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