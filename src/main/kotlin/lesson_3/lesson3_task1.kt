package lesson_3

fun main() {
    val dayGreeting = "Good Afternoon"
    val nightGreeting = "Good Evening"
    val userName = "John Wick"

    var greeting = "$dayGreeting, $userName"
    println(greeting)

    greeting = "$nightGreeting, $userName"
    println(greeting)
}