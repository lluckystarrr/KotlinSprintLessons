package org.example.lesson_10

fun main() {
    val humanNumber = dice()
    println("Бросает человек: $humanNumber")

    val computerNumber = dice()
    println("Бросает компьютер: $computerNumber")

    if (humanNumber < computerNumber) {
        println("Победил компьютер")
    } else if (humanNumber > computerNumber) {
        println("Победил человек")
    } else {
        println("Ничья")
    }
}

fun dice(): Int {
    val number = (1..6).random()
    return number
}
