package lesson_2

fun main() {
    val percentIncrease = 20
    val totalPercent = 100

    val initialCrystal = 7
    val initialIron = 11

    val bonusCrystal = (initialCrystal * percentIncrease / totalPercent)
    val bonusIron = (initialIron * percentIncrease / totalPercent)

    println("Бонусные кристалы - $bonusCrystal")
    println("Бонусное железо - $bonusIron")
}
