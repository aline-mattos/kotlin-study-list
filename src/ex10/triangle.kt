package ex10

//Create a "Triangle" class with attributes "base" and "height".
// Add a method called "area" that calculates and returns the area of the triangle.

class Triangle(val base: Double, val height: Double) {

    fun calculateArea(): Double {
        return 0.5 * base * height
    }
}

fun main() {
    println("Digite a base do triângulo: ")
    val baseInput = readLine()!!.toDouble()

    println("Digite a altura do triângulo: ")
    val heightInput = readLine()!!.toDouble()

    val triangle = Triangle(baseInput, heightInput)

    val triangleArea = triangle.calculateArea()

    println("A área do triângulo é: $triangleArea")
}