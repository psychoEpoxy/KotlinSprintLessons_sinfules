package lesson_5

fun main() {
    val lotteryNumbers = List(3) { (0..42).random() }

    val userNumbers = mutableListOf<Int>()

    println("Введите три числа от 0 до 42:")

    for (i in 1..3) {
        print("Введите число $i: ")
        val userInput = readln().toIntOrNull()
        if (userInput != null && userInput in 0..42) {
            userNumbers.add(userInput)
        } else {
            println("Некорректный ввод. Введите число от 0 до 42.")
            return
        }
    }

    val matchedNumbers = lotteryNumbers.intersect(userNumbers).size

    val resultText = when (matchedNumbers) {
        3 -> "Поздравляем! Вы угадали все числа и выиграли джекпот!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз!"
        else -> "Вы не угадали ни одного числа."
    }

    println(resultText)

    println("Выигрышные числа: $lotteryNumbers")
}
