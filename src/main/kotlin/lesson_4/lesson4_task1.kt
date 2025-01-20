package lesson_4

fun main() {
    var bookingToday = 13
    var bookingTomorrow = 9

    val availableToday = bookingToday < TOTAL_TABLE
    val availableTomorrow = bookingTomorrow < TOTAL_TABLE

    println("Доступность столиков на сегодня: $availableToday")
    println("Доступность столиков на завтра: $availableTomorrow")
}

const val TOTAL_TABLE = 13