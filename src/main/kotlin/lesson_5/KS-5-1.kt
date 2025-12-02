package org.example.lesson_5

fun main() {
    println("Сколько будет 7 + 8?")
    val expression = 7 + 8
    val answer = readln().toInt()
    if (answer == expression) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}