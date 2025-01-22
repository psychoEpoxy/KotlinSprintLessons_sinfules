package lesson_5

fun main() {
    print("Введите первое число от 0 до 42: ")
    val userNumber1 = readln().toIntOrNull()

    print("Введите второе число от 0 до 42: ")
    val userNumber2 = readln().toIntOrNull()

    if (userNumber1 != null && userNumber2 != null) {
        println("Правильные числа для победы: $FIRST_CORRECT_NUMBER и $SECOND_CORRECT_NUMBER")
        if ((userNumber1 == FIRST_CORRECT_NUMBER && userNumber2 == SECOND_CORRECT_NUMBER) || (userNumber1 == SECOND_CORRECT_NUMBER && userNumber2 == FIRST_CORRECT_NUMBER)) {
            println("Поздравляем! Вы выиграли главный приз!")
        } else if (userNumber1 == FIRST_CORRECT_NUMBER || userNumber1 == SECOND_CORRECT_NUMBER || userNumber2 == FIRST_CORRECT_NUMBER || userNumber2 == SECOND_CORRECT_NUMBER) {
            println("Вы выиграли утешительный приз!")
        } else {
            println("Неудача!")
        }
    } else {
        println("Некорректный ввод чисел.")
    }
}

const val FIRST_CORRECT_NUMBER = 15
const val SECOND_CORRECT_NUMBER = 30