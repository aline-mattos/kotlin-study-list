package ex9

//Create a function that receives a list of integers and returns a list of numbers in ascending order,
// without using the language's sorting method.

fun orderList(list: MutableList<Int>): List<Int> {
    val size = list.size

    for (i in 0 until size - 1) {
        for (j in 0 until size - i - 1) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
    return list
}

fun main() {
    val numbers = mutableListOf(5, 2, 8, 1, 7, 3)

    val ascendingNumbers = orderList(numbers.toMutableList())

    println("Números em ordem crescente: $ascendingNumbers")
}