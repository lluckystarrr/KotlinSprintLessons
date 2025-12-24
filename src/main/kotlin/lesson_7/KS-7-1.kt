package org.example.lesson_7

fun main() {

    for (i in 1..3) {
        val number = (1..9).random()
        print(number)
        val letter: Char = ('a'..'z').random()
        print(letter)
    }
}