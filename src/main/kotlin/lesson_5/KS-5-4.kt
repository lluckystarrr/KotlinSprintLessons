package org.example.lesson_5

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введите логин")
    val userLogin = readln()

    if (userLogin == LOGIN) {
        println("Введите пароль")
        val userPassword = readln()

        if (userPassword == PASSWORD) {
            println("Добро пожаловать!")
        } else {
            println("Неверный пароль!")
        }
    } else {
        println("Неверный пароль!")
    }
}