package org.example.lesson_6

fun main() {
    println("Сколько секунд нужно засечь?")

    var usersSec = readln().toInt()

    while (usersSec > 0 ) {
        println("Осталось секунд: ${usersSec--}")
        Thread.sleep(1000)
    }
    if (usersSec == 0) {
        println("Время вышло")
    }
}