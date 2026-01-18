package org.example.lesson_10

fun main() {

    println("Придумай логин")
    val login = readln()
    println("Придумай пароль")
    val password = readln()

    val checkResult = validateCredentials(login, password)

    if (checkResult) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateCredentials(login: String, password: String): Boolean = login.length >= 4 && password.length >= 4
