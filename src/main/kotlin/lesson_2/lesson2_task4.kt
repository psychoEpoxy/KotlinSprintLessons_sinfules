package lesson_2

fun main() {
    val buff = 0.2

    val crystal = 7
    val iron = 11

    val bonusCrystal = (crystal * buff).toInt()
    val bonusIron = (iron * buff).toInt()

    println("Бонусные кристалы - $bonusCrystal")
    println("Бонусное железо - $bonusIron")
}