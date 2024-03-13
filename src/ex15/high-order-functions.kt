package ex15

//Let's create a program that uses high-order functions to operate on an array of integers.
// You must create high-order functions to perform the following operations:
// filtrarPares: A function that filters and returns only even numbers in the array;
// dobrarValores: A function that doubles the value of each number in the array;
// somarValores: A function that calculates the sum of all values in the array.
// Then, create an array of integers and use high-order functions to perform these operations.

fun filtrarPares(array: IntArray): IntArray {
    return array.filter { it % 2 == 0 }.toIntArray()
}

fun dobrarValores(array: IntArray): IntArray {
    return array.map { it * 2 }.toIntArray()
}

fun somarValores(array: IntArray): Int {
    return array.sum()
}

fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val numerosPares = filtrarPares(numeros)
    val numerosDobrados = dobrarValores(numeros)
    val somaTotal = somarValores(numeros)

    println("Números originais: ${numeros.joinToString()}")
    println("Números pares: ${numerosPares.joinToString()}")
    println("Números dobrados: ${numerosDobrados.joinToString()}")
    println("Soma total: $somaTotal")
}