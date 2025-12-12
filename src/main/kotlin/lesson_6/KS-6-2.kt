package org.example.lesson_6

fun main() {
    println("Сколько секунд нужно засечь?")

    val usersSec = readln().toInt()

    Thread.sleep(usersSec * 1000L)
    println("Прошло секунд - $usersSec")
}