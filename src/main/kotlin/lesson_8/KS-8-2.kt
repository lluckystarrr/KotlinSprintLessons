package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("морковь", "картофель", "огурец", "кукуруза", "курица")

    println("Какой ингредиент ты ищешь?")
    val inputIngredient = readln()

    for (ingredient in arrayOfIngredients) {
        if (ingredient == inputIngredient) {
            println("Ингредиент \"$inputIngredient\" есть в рецепте")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}