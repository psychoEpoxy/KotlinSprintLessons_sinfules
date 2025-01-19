package lesson_3

fun main() {
    var start = "E7"
    var stop = "E6"
    var moveNumber = 1

    println("[$start, $stop; $moveNumber]")

    start = "D2"
    stop = "D3"
    println("[$start, $stop; ${moveNumber + 1}]")

}