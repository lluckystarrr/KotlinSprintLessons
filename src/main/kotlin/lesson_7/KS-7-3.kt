package org.example.lesson_7

fun main() {

    println("Введи максимальное число")
    val userNumber = readln().toInt()
    val inputNumber = userNumber

    for (i in 0..inputNumber step 2) {
        println("$i")
    }
}