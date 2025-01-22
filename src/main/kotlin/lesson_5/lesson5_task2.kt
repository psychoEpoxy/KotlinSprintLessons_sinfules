package lesson_5

fun main() {
    val currentYear = 2025

    print("Введите ваш год рождения: ")
    val userAge = readln().toIntOrNull()

    val resultText = if (userAge != null) {
        val age = currentYear - userAge
        if (age >= ADULT_OF_MAJORITY) {
            "Показать экран со скрытым контентом"
        } else {
            "Доступ закрыт"
        }
    } else {
        "Некорректный ввод года рождения."
    }

    println(resultText)
}

const val ADULT_OF_MAJORITY = 18