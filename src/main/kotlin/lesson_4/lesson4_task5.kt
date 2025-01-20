package lesson_4


fun main() {
    println("Есть ли повреждения корпуса? (true/false):")
    val isDamage = readLine()?.toBoolean() ?: false

    println("Введите текущий состав экипажа:")
    val crewCounter = readLine()?.toInt() ?: 0

    println("Введите количетсво ящиков с провизией на борту:")
    val foodBoxes = readLine()?.toInt() ?: 0

    println("Благоприятная ли сейчас погода? (true/false)")
    val weather = readLine()?.toBoolean() ?: false

    val conditions =
        (!isDamage && crewCounter in MIN_CREW_COUNTER..MAX_CREW_COUNTER && foodBoxes > MIN_FOOD_BOXES && (weather || !weather)) ||
                (isDamage && crewCounter == MAX_CREW_COUNTER && weather && foodBoxes >= MIN_FOOD_BOXES)

    println("Корабль может отправиться в плавание: $conditions")
}

const val MIN_CREW_COUNTER = 55
const val MAX_CREW_COUNTER = 70
const val MIN_FOOD_BOXES = 50
