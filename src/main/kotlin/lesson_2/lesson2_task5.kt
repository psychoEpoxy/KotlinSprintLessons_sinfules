package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70_000.0
    val percent = 16.7 / 100
    val years = 20

    val compoundInterest = deposit * (1 + percent).pow(years)

    println("Размер вклада через $years лет: %.3f".format(compoundInterest))
}
