package org.example.lesson_9

fun main() {
    val ingredients = listOf("яйца", "молоко", "сливочное масло")
    val size = listOf(2, 50, 15)

     println("Сколько порций нужно?")
    val quantity = readln().toInt()

    val result = size.map {
        it * quantity
    }
    println("На $quantity порций вам потребуется: " +
            "${ingredients[0]} - ${result[0]}, " +
            "${ingredients[1]} - ${result[1]}, " +
            "${ingredients[2]} - ${result[2]}")
}