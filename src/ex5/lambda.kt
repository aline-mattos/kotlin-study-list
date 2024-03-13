package ex5

val maxNumber: (Int, Int) -> Int = { a, b -> if (a > b) a else b }

fun main() {
    val number1 = 65
    val number2 = 30

    val result = maxNumber(number1, number2)
    println("O maior número entre $number1 e $number2 é: $result")
}