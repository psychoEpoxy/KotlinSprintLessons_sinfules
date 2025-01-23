package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70_000.0
    val percent = 16.7
    val percentDivider = 100.0
    val years = 20

    val interestRate = percent / percentDivider

    val compoundInterest = deposit * (1 + interestRate).pow(years)

    println("Размер вклада через $years лет: %.3f".format(compoundInterest))
}