package org.example.lesson_10

fun main() {

    println("Придумай логин")
    val createLogin = readln()
    println("Придумай пароль")
    val createPassword = readln()

    val checkResult = check(createLogin, createPassword)

    if (checkResult) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun check(createLogin: String, createPassword: String): Boolean {
    val result = createLogin.length >= 4 && createPassword.length >= 4
    return result
}