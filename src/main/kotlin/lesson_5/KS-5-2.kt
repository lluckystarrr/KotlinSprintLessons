package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
const val RECENT_YEAR = 2025

fun main() {

    val userBirthYear = readln().toInt()
    val userAge = RECENT_YEAR - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Show special content")
    } else {
        println("Back to main screen")
    }
}
