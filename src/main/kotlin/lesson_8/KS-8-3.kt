package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("морковь", "картофель", "огурец", "кукуруза", "курица")

    println("Какой ингредиент ты ищешь?")
    val inputIngredient = readln()

    if (inputIngredient in arrayOfIngredients) {
        println("Ингредиент \"$inputIngredient\" есть в рецепте")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}