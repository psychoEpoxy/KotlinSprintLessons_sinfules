package lesson_2

fun main() {
    val employees: Byte = 50
    val employeesSalary: Int = 30_000

    val interns: Byte = 30
    val internSalary: Int = 20_000

    val totalMoneyEmp = employees * employeesSalary
    val totalMoneyWithInterns = totalMoneyEmp + (interns * internSalary)

    val totalEmp = employees + interns
    val avgSalary = totalMoneyWithInterns / totalEmp

    println("Расходы на постоянных сотрудников: $totalMoneyEmp")
    println("Общие расходы на ЗП: $totalMoneyWithInterns")
    println("Средняя ЗП после устройства стажеров: $avgSalary")
}