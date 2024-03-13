package ex1

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