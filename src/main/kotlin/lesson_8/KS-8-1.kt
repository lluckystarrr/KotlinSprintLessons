package org.example.lesson_8

fun main() {

    val weeksView = arrayOf(7, 8, 3, 1, 9, 4, 5)
    var sumView = 0

    for (dayView in weeksView) {
        sumView += dayView
    }
    print("$sumView")
}