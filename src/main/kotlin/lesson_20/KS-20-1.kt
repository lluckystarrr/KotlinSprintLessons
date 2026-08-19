package org.example.lesson_20

val greetings: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }

fun main() {
    println(greetings("Лукиситар"))
}