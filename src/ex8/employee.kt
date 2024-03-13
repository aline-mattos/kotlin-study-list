package ex8

//Create an "Employee" class with the attributes "name", "age" and "salary".
// Create a function that takes a list of employees and returns the employee with the highest salary.

class Employee(val name: String, val age: Int, val salary: Double)

fun findHigherSalary(list: List<Employee>): Employee? {
    if (list.isEmpty()) {
        return null
    }

    var higherSalary = list[0]

    for (i in 1 until list.size) {
        if (list[i].salary > higherSalary.salary) {
            higherSalary = list[i]
        }
    }

    return higherSalary
}

fun main() {
    val employee1 = Employee("Aline", 30, 50000.0)
    val employee2 = Employee("Daniel", 35, 60000.0)
    val employee3 = Employee("Pepe", 28, 55000.0)

    val employeeList = listOf(employee1, employee2, employee3)

    val higherEmployeeSalary = findHigherSalary(employeeList)

    if (higherEmployeeSalary != null) {
        println("O funcionário com o maior salário é: ${higherEmployeeSalary.name}")
    }

}