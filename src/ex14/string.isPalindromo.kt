package ex14

//Create an extension function called isPalindrome for the String class that checks whether the string is a palindrome.
// The function must ignore whitespace and be case-insensitive. Then use this function to check whether some words are palindromes.

fun String.isPalindrome(): Boolean {
    val formated = this.replace("\\s".toRegex(), "").lowercase()
    val reversed = formated.reversed()
    return formated == reversed
}

fun main() {
    val test1 = "hello"
    val test2 = "Ana"
    val test3 = "Socorram me subi no onibus em Marrocos"
    val test4 = "Roma e Amor"
    val test5 = "tchau e bença"

    println("A frase ou palavra '$test1' é palíndromo? ${test1.isPalindrome()}")
    println("A frase ou palavra '$test2' é palíndromo? ${test2.isPalindrome()}")
    println("A frase ou palavra '$test3' é palíndromo? ${test3.isPalindrome()}")
    println("A frase ou palavra '$test4' é palíndromo? ${test4.isPalindrome()}")
    println("A frase ou palavra '$test5' é palíndromo? ${test5.isPalindrome()}")
}