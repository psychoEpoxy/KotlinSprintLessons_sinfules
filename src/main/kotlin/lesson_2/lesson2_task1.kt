package lesson_2

fun main() {
    val mark1: Int = 3
    val mark2: Int = 4
    val mark3: Int = 3
    val mark4: Int = 5

    val averageScore: Float = (mark1 + mark2 + mark3 + mark4) / 4.0f

    println("Средняя оценка в классе: ${String.format("%.2f", averageScore)}")
}