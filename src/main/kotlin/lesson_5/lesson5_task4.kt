package lesson_5

fun main() {
    print("Введите имя пользователя для входа в систему: ")
    val username = readln()

    val resultText = if (username == REGISTERED_USERNAME) {
        print("Введите пароль: ")
        val password = readln()

        if (password == REGISTERED_PASSWORD) {
            "Пользователь \"$username\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... "
        } else {
            "Пароль неверный. Доступ запрещен."
        }
    } else {
        "Пользователь не найден. Предлагаю зарегистрироваться."
    }

    println(resultText)
}

const val REGISTERED_USERNAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"