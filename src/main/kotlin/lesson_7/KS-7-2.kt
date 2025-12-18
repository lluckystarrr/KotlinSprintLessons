package org.example.lesson_7

fun main() {

    var code = (1000..9999).random()
    println("Ваш код авторизации: $code")

    var userCode: Int

    do {
        println("Введите код")
        userCode = readln().toInt()

        if (userCode != code) {
            code = (1000..9999).random()
            println("Неверно. Ваш новый код авторизации: $code")

        }
    } while (userCode != code)

    println("Добро пожаловать!")
}