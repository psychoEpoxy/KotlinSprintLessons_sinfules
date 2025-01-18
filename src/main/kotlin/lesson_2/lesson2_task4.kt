package lesson_2

fun main() {
    val buff: Byte = 20

    val crystal: Byte = 7
    val iron: Byte = 11

    val bonusCrystal = (crystal * buff) / 100
    val bonusIron = (iron * buff) / 100

    println("Бонусные кристалы - $bonusCrystal")
    println("Бонусное железо - $bonusIron")
}