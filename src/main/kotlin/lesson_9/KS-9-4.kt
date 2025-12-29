package org.example.lesson_9

fun main() {
    println("Напиши 5 ингредиентов через запятую")
    val inputIngredients = readln()
    val savedIngredients = inputIngredients.split(", ").sorted()

    savedIngredients.forEach {
        println(it)
    }
}