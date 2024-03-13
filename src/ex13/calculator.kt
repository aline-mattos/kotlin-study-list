package ex13

//Create a higher-order function called operacaoMatematica that accepts two numbers and a lambda function.
// The operacaoMatematica function must apply the lambda function to the two numbers and return the result.
// Then create some lambda functions to perform mathematical operations such as addition, subtraction, multiplication, and division.
// Use the higher order function to perform these operations with different pairs of numbers.

fun operacaoMatematica(a: Double, b: Double, operacao: (Double, Double) -> Double): Double {
    return operacao(a, b)
}

val soma: (Double, Double) -> Double = { a, b -> a + b }
val subtracao: (Double, Double) -> Double = { a, b -> a - b }
val multiplicacao: (Double, Double) -> Double = { a, b -> a * b }
val divisao: (Double, Double) -> Double = { a, b -> if (b != 0.0) a / b else Double.NaN }

fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()?.toDoubleOrNull()
    if (num1 == null) {
        println("Número inválido.")
        return
    }

    println("Digite o segundo número:")
    val num2 = readLine()?.toDoubleOrNull()
    if (num2 == null) {
        println("Número inválido.")
        return
    }

    val resultadoSoma = operacaoMatematica(num1, num2, soma)
    println("Soma: $resultadoSoma")

    val resultadoSubtracao = operacaoMatematica(num1, num2, subtracao)
    println("Subtração: $resultadoSubtracao")

    val resultadoMultiplicacao = operacaoMatematica(num1, num2, multiplicacao)
    println("Multiplicação: $resultadoMultiplicacao")

    val resultadoDivisao = operacaoMatematica(num1, num2, divisao)
    println("Divisão: $resultadoDivisao")
}