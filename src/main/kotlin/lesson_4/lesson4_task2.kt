package lesson_4


fun main() {
    val weightFirst = 20
    val volumeFirst = 80
    val weightSecond = 50
    val volumeSecond = 100
    println("Груз весом $weightFirst кг. и объёмом $volumeFirst л. соответствует категории 'Average':${weightFirst > MIN_WIGHT && weightFirst <= MAX_WIGHT && volumeFirst < MAX_VOLUME}")
    println("Груз весом $weightSecond кг. и объёмом $volumeSecond л. соответствует категории 'Average':${weightSecond > MIN_WIGHT && weightFirst <= MAX_WIGHT && volumeSecond < MAX_VOLUME}")
}

const val MIN_WIGHT = 35
const val MAX_WIGHT = 100
const val MAX_VOLUME = 100