package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("курица", "картофель", "огурец", "морковь", "горошек")
    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach {
        println(it)
    }
}
