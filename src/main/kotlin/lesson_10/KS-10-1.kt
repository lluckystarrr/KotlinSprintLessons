package org.example.lesson_10

fun main() {

    println("Ход человека. Бросайте кости")
    val humanNumber = rollDice()
    println("Ваше число: $humanNumber")

    println("Ход компьютера. Бросайте кости")
    val computerNumber = rollDice()
    println("Ваше число: $computerNumber")

    if (humanNumber < computerNumber) {
        println("Победил компьютер")
    } else if (humanNumber > computerNumber) {
        println("Победил человек")
    } else {
        println("Ничья")
    }
}

fun rollDice(): Int = (1..6).random()