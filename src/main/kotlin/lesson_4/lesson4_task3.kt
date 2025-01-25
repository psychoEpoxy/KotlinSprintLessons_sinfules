package lesson_4


fun main() {
    val sunnyToDay = true
    val openTentAtMoment = true
    val humidityAtMoment = 20
    val currentSeason = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            IS_SUNNY == sunnyToDay
                    && OPEN_TENT == openTentAtMoment
                    && HUMIDITY == humidityAtMoment
                    && BAD_SEASON != currentSeason
        }"
    )
}

const val IS_SUNNY = true
const val OPEN_TENT = true
const val HUMIDITY = 20
const val BAD_SEASON = "зима"