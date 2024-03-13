package ex7

fun findLongerString(list: List<String>): String? {
    if (list.isEmpty()){
        return null
    }

    var longerString = list[0]

    for (i in 1 until list.size) {
        if (list[i].length > longerString.length){
            longerString = list[i]
        }
    }

    return longerString
}

fun main() {
    val stringList = listOf("Aline", "Vladimir", "Daniel", "Lizandra")

    val longerString = findLongerString(stringList)

    println("A string mais longa é: $longerString")
}