package lesson_5

fun main() {
    print("Введите расстояние поездки (в километрах): ")
    val distance = readln().toDoubleOrNull()

    print("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toDoubleOrNull()

    print("Введите текущую цену за литр топлива: ")
    val fuelPrice = readln().toDoubleOrNull()

    if (distance != null && fuelConsumption != null && fuelPrice != null &&
        distance > 0 && fuelConsumption > 0 && fuelPrice > 0) {

        val totalFuel = (distance * fuelConsumption) / 100

        val totalCost = totalFuel * fuelPrice

        println("Общее количество необходимого топлива: %.2f литров".format(totalFuel))
        println("Итоговая стоимость поездки: %.2f рублей".format(totalCost))
    } else {
        println("Некорректный ввод данных. Убедитесь, что все значения введены правильно.")
    }
}