package lesson_4


fun main() {
    val weatherSunny = true
    val openTent = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weatherSunny && openTent && humidity == 20 && season != "зима"}")
}
