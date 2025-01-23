package lesson_4


fun main() {
    println("Есть ли повреждения корпуса? (true/false):")
    val isDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crewCounter = readln().toInt()

    println("Введите количетсво ящиков с провизией на борту:")
    val foodBoxes = readln().toInt()

    println("Благоприятная ли сейчас погода? (true/false)")
    val weather = readln().toBoolean()

    val conditions =
        (!isDamage
                && crewCounter in MIN_CREW_COUNTER..MAX_CREW_COUNTER
                && foodBoxes > MIN_FOOD_BOXES
                && (weather || !weather)) ||
                (isDamage && crewCounter == MAX_CREW_COUNTER && weather && foodBoxes >= MIN_FOOD_BOXES)

    println("Корабль может отправиться в плавание: $conditions")
}

const val MIN_CREW_COUNTER = 55
const val MAX_CREW_COUNTER = 70
const val MIN_FOOD_BOXES = 50