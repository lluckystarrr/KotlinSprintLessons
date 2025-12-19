package org.example.lesson_6

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9

fun main() {
    val randomNumber = (1..9).random()
    println("Угадай число от $MIN_NUMBER до $MAX_NUMBER")

    var number: Int
    var attempt = 5

    do {
        number = readln().toInt()
        if (number != randomNumber) {
            --attempt
            println("Неверно. Осталось попыток - $attempt")
        } else {
            println("Это была великолепная игра!")
            return
        }
    } while (attempt > 0)

    println("Увы, было загадано число $randomNumber")
}