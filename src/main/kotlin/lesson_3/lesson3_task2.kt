package lesson_3

fun main() {
    val patronymic = "Андреева"
    val name = "Татьяна"
    var surname = "Сергеевна"
    var age = 20
    println("$surname $name $patronymic, $age")

    age = 22
    surname = "Сидорова"

    println("$surname $name $patronymic, $age")
}