package org.example.lesson_3

fun main() {
    var greeting = "Добрый день"
    val userName = "Lucky Star"
    val dayGreeting = "$greeting, $userName!"

    println(dayGreeting)

    greeting = "Добрый вечер"
    val eveningGreeting = "$greeting, $userName!"

    println(eveningGreeting)
}