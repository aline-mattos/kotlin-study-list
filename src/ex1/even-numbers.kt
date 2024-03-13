package ex1

// Create a function that takes an integer and returns true if
// the number is even and false otherwise.

fun isEven(number: Int): Boolean{
    return number % 2 == 0
}

fun main(){
    print("Digite um número inteiro: ")

    val input =  readLine()
    val number = input?.toInt()
    val result = number?.let { isEven(it) }

    if (result!!) {
        println("O número $number é par.")
    } else {
        println("O número $number não é par")
    }
}