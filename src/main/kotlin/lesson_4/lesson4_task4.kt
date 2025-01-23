package lesson_4


fun main() {
    val trainingDay = 5

    val isEvanDay = trainingDay % 2 != 0

    println(
        """
        Упражнения для рук: $isEvanDay
        Упражнения для ног: ${!isEvanDay}
        Упражнения для спины: ${!isEvanDay}
        Упражнения для пресса: $isEvanDay
    """.trimIndent()
    )
}
