package org.example.lesson_6

fun main() {

    println("Придумай логин")
    val createLogin = readln()
    println("Придумай пароль")
    val createPassword = readln()

    var login: String
    var password: String

    do {
        println("Введи логин")
        login = readln()
        println("Введи пароль")
        password = readln()

        if (login != createLogin || password != createPassword) {
            println("Неверный логин или пароль. Попробуй снова.")
        }
    } while (login != createLogin || password != createPassword)

    println("Авторизация прошла успешно")
}