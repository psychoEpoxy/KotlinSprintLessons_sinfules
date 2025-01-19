package lesson_2

fun main() {
    val numberOfStudents = 4
    val markFirstStudent = 3
    val markSecondStudent = 4
    val markThirdStudent = 3
    val markFourthStudent = 5

    val averageScore =
        (markFirstStudent + markSecondStudent + markThirdStudent + markFourthStudent).toFloat() / numberOfStudents

    println("Средняя оценка в классе: ${String.format("%.2f", averageScore)}")
}