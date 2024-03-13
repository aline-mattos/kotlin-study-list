package ex11

//Create a function that takes a list of strings and returns a list of all strings
// that begin with the letter "A", in alphabetical order.

fun filterAndOrder(lista: List<String>): List<String> {
    val stringsA = lista.filter { it.startsWith("A", ignoreCase = true) }
    return stringsA.sorted()
}

fun main() {
    val list = listOf("Abacaxi", "Maçã", "Banana", "Amora", "Pêssego", "Uva", "Abóbora", "Damasco", "Ameixa")

    val filter = filterAndOrder(list)

    println("Palavras que começam com 'A', em ordem alfabética: $filter")
}