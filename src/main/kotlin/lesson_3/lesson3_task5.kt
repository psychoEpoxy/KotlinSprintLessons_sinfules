package lesson_3

fun main() {
    val moveString = "D2-D4;0"

    val parts = moveString.split(";", "-")
    val start = parts[0]
    val stop = parts[1]
    val moveNumber = parts[2]

    println("Откуда: $start")
    println("Куда: $stop")
    println("Номер хода: $moveNumber")
}