package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("морковь", "картофель", "огурец", "кукуруза", "курица")

    println("Какой ингредиент ты ищешь?")
    val inputIngredient = readln()

    val ingredient = arrayOfIngredients.contains(inputIngredient)
    if (ingredient) {
        println("Ингредиент \"$inputIngredient\" есть в рецепте")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}