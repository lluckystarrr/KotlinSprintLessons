package org.example.lesson_10

fun main() {

    var winsCounter = 0

    do {
        val humanNumber = dice()
        println("Бросает человек: $humanNumber")

        val computerNumber = dice()
        println("Бросает компьютер: $computerNumber")

        if (humanNumber < computerNumber) {
            println("Победил компьютер")
        } else if (humanNumber > computerNumber) {
            winsCounter++
            println("Победил человек")
        } else {
            println("Ничья")
        }
    } while (countRounds())
    println("Количество побед - $winsCounter")
}

fun dice(): Int {
    val number = (1..6).random()
    return number
}

fun countRounds(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln()
    return (answer.equals("да", ignoreCase = true))
}