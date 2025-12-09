package org.example.lesson_5

fun main() {
    val firstNumber = 7
    val secondNumber = 8
    val expression = firstNumber + secondNumber

    println("Сколько будет $firstNumber + $secondNumber?")

    val answer = readln().toInt()
    if (answer == expression) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}