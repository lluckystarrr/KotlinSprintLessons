package org.example.lesson_10

fun main() {

    var winsCounter = 0

    do {
        val humanNumber = rollDice()
        println("Бросает человек: $humanNumber")

        val computerNumber = rollDice()
        println("Бросает компьютер: $computerNumber")

        if (humanNumber < computerNumber) {
            println("Победил компьютер")
        } else if (humanNumber > computerNumber) {
            winsCounter++
            println("Победил человек")
        } else {
            println("Ничья")
        }
    } while (askToContinue())
    println("Количество побед - $winsCounter")
}

fun rollDice(): Int = (1..6).random()

fun askToContinue(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val answer = readln()
    return (answer.equals("да", ignoreCase = true))
}
