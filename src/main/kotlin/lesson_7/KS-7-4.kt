package org.example.lesson_7

fun main() {
    println("Сколько засечь секунд?")
    val seconds = readln().toInt()

    for (timer in seconds downTo 1) {
        println("До конца таймера $timer")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}