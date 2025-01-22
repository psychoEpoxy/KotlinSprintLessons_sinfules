package lesson_2

fun main() {
    val buff = 20

    val crystal = 7
    val iron = 11

    val bonusCrystal = (crystal * buff / 100)
    val bonusIron = (iron * buff / 100)

    println("Бонусные кристалы - $bonusCrystal")
    println("Бонусное железо - $bonusIron")
}