package lesson_5

fun main() {
    val num1 = (1..10).random()
    val num2 = (1..10).random()

    print("Решите пример: $num1 + $num2 = ")

    val userAnswer = readln().toIntOrNull()

    if (userAnswer == num1 + num2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
