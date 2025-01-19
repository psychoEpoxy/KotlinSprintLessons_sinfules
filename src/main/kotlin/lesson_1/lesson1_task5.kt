package lesson_1

fun main() {
    val seconds: Short = 6380
    val hours = seconds / SECOND_IN_HOUR
    val remainingSeconds = seconds % SECOND_IN_HOUR

    val minute = remainingSeconds / SECOND_IN_MINUTE
    val newSeconds = remainingSeconds % SECOND_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minute, newSeconds)
    println(formattedTime)
}

const val SECOND_IN_HOUR = 3600
const val SECOND_IN_MINUTE = 60