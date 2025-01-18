package lesson_2

import kotlin.math.pow

fun main() {
    val deposit: Double = 70_000.0
    val percent: Double = 0.167
    val years: Int = 20

    val compoundInterest = deposit * (1 + percent).pow(years.toDouble())

    println("Через $years лет под ${percent * 100}% клиет получит: ${String.format("%.3f", compoundInterest)}")
}
