//package org.example.lesson_6
//
const val MIN_NUMBER = 1
const val MAX_NUMBER = 9

fun main() {
    val randomNumber = (1..9).random()
    println("Угадай число от $MIN_NUMBER до $MAX_NUMBER")

    var number: Int
    var attempt = 5

    do {
        number = readln().toInt()
        --attempt
        if ((attempt > 0) && (number != randomNumber)) {
            println("Неверно. Осталось попыток - $attempt")
        }
    } while ((attempt > 0) && (number != randomNumber))

    if (number != randomNumber) {
        println("Увы, было загадано число $randomNumber")
    } else {
        println("Это была великолепная игра!")
    }
}