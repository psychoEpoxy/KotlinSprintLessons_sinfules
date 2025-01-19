package lesson_1

fun main() {
    val secondInSpace = 6380
    val hours = secondInSpace / SECOND_IN_HOUR
    val remainingSeconds = secondInSpace % SECOND_IN_HOUR

    val minute = remainingSeconds / SECOND_IN_MINUTE
    val seconds = remainingSeconds % SECOND_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minute, seconds)
    println(formattedTime)
}

const val SECOND_IN_HOUR = 3600
const val SECOND_IN_MINUTE = 60