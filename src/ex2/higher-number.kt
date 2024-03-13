package ex2

fun higherNumber(array: IntArray): Int {
    var higherNumber = array[0]

    for (number in array){
        if (number > higherNumber) {
            higherNumber = number
        }
    }
    return higherNumber
}

fun main(){
    val numbers = intArrayOf(10, 8, 12, 66, 54, 72)
    val higherNumber = higherNumber(numbers)

    println("O maior número é $higherNumber")
}