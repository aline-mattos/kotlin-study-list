package ex3

//Create a class called "Person" with attributes "name" and "age".
// Then create a list of "Person" objects and sort the list alphabetically by the "name" attribute.

class Person(val name: String, val age: Int)

fun main(){
    val people = listOf(
        Person("Vladimir", 58),
        Person("Aline", 28),
        Person("Beatriz", 20),
        Person("Amanda", 24),
        Person("Anderson", 25),
        Person("Daniel", 26),
        Person("Adriana", 24),
        Person("Lizandra", 58),
        Person("Lara", 28),
        Person("Murilo", 30)
    )

    val alphaOrder = people.sortedBy { it.name }

    println("Nomes em Ordem Alfabética: ")

    for (person in alphaOrder) {
        println("Nome: ${person.name}, Idade: ${person.age}")
    }
}