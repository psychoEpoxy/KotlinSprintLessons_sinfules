package lesson_2

fun main() {
    val totalMinute = DEPARTURE_MINUTE + TRAVEL_TIME_MINUTE
    val arrivalHours = (DEPARTURE_HOURS + totalMinute / 60) % 24
    val arrivalMinute = totalMinute % 60

    println(String.format("%02d:%02d", arrivalHours, arrivalMinute))
}

const val DEPARTURE_HOURS = 9
const val DEPARTURE_MINUTE = 39
const val TRAVEL_TIME_MINUTE = 457
