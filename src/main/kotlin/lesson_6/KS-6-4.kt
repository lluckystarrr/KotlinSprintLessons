package org.example.lesson_6

const val WIN_NUMBER = 3
const val MIN_NUMBER = 1
const val MAX_NUMBER = 9

fun main() {
    println("Угадай число от $MIN_NUMBER до $MAX_NUMBER")

    var number = readln().toInt()
    var attempt = 5

    while ((attempt > 1) && (number != WIN_NUMBER)) {
        println("Неверно. Осталось попыток - ${--attempt}")
        number = readln().toInt()
    }
    if (number != WIN_NUMBER) {
        println("Увы, было загадано число $WIN_NUMBER")
    } else {
        println("Это была великолепная игра!")
    }
}