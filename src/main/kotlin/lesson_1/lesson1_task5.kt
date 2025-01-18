package lesson_1

fun main() {
    val seconds: Short = 6380
    val hours = seconds / 3600
    val remainingSeconds = seconds % 3600

    val minute = remainingSeconds / 60
    val newSeconds = remainingSeconds % 60

    println("$hours:$minute:$newSeconds")
}