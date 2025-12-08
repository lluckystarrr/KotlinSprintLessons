package org.example.lesson_5

fun main() {
    var firstNumber = 7
    var secondNumber = 8
    val expression = firstNumber + secondNumber

    println("Сколько будет $firstNumber + $secondNumber?")

    val answer = readln().toInt()
    if (answer == expression) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}