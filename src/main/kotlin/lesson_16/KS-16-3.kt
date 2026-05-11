package org.example.lesson_16

class User(private val login: String, private val password: String) {

    fun checkLogin(inputLogin: String): Boolean {
        return login == inputLogin
    }

    fun checkPassword(inputPassword: String): Boolean {
        return password == inputPassword
    }
}

fun main() {
    val correctUser = User("login", "parol")

    println("Введите логин")
    val inputLogin = readln()
    val loginResult = correctUser.checkLogin(inputLogin)

    if (loginResult) {
        println("Введите пароль")
        val inputPassword = readln()
        val passwordResult = correctUser.checkPassword(inputPassword)

        if (passwordResult) {
            println("Вход выполнен")
        } else {
            println("Пароль неверный")
        }
    } else {
        println("Логин неверный")
    }
}