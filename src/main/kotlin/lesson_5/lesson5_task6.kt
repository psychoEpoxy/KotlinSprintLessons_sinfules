package lesson_5

fun main() {
    println("Введите ваш вес в килограммах:")
    val weight = readln().toDoubleOrNull()

    println("Введите ваш рост в сантиметрах:")
    val heightCentimeters = readln().toDoubleOrNull()

    if (weight != null && heightCentimeters != null && weight > 0 && heightCentimeters > 0) {
        val heightMeters = heightCentimeters / 100

        val bmi = weight / (heightMeters * heightMeters)

        val category = when {
            bmi < BMI_UNDER_WEIGHT -> "Недостаточная масса тела"
            bmi < BMI_NORMAL_UPPER -> "Нормальная масса тела"
            bmi < BMI_OVERWEIGHT_UPPER -> "Избыточная масса тела"
            else -> "Ожирение"
        }

        println("Ваш ИМТ: %.2f".format(bmi))
        println("Категория: $category")
    } else {
        println("Некорректный ввод данных. Убедитесь, что вес и рост введены правильно.")
    }
}

const val BMI_UNDER_WEIGHT = 18.5
const val BMI_NORMAL_UPPER = 25.0
const val BMI_OVERWEIGHT_UPPER = 30.0