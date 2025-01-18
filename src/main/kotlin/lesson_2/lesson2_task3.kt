package lesson_2

fun main() {
    val hour : Byte = 9
    val minute : Byte = 39
    val travelTimeMinute: Int = 457

    val hourInMinute = hour * 60
    val totalMinute = minute + hourInMinute + travelTimeMinute

    val finalHour = totalMinute / 60
    val finalMinute = totalMinute % 60

    println("Поезд прибудет в: $finalHour:$finalMinute")
}