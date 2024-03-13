package ex4

fun isPalindrome(str: String): Boolean {
    val noSpaces = str.replace("\\s".toRegex(), "").lowercase()
    return noSpaces == noSpaces.reversed()
}

fun main() {
    val test1 = "hello"
    val test2 = "Ana"
    val test3 = "Socorram me subi no onibus em Marrocos"
    val test4 = "roma e amor"
    val test5 = "tchau e bença"

    println("A frase ou palavra '$test1' é palíndromo? ${isPalindrome(test1)}")
    println("A frase ou palavra '$test2' é palíndromo? ${isPalindrome(test2)}")
    println("A frase ou palavra '$test3' é palíndromo? ${isPalindrome(test3)}")
    println("A frase ou palavra '$test4' é palíndromo? ${isPalindrome(test4)}")
    println("A frase ou palavra '$test5' é palíndromo? ${isPalindrome(test5)}")
}