package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("курица", "картофель", "огурец", "морковь", "горошек")
    for (ingredients in arrayOfIngredients) {
        println(ingredients)
    }

    println("Какой ингредиент заменить?")
    val changeIngredients = readln()

    val ingredient = arrayOfIngredients.contains(changeIngredients)
    if (ingredient) {
        println("На какой ингредиент заменим?")
        val inputIngredients = readln()

        val index = arrayOfIngredients.indexOf(changeIngredients)
        arrayOfIngredients[index] = inputIngredients

        println("Готово! Вы сохранили следующий список:")
        for (ingredients in arrayOfIngredients) {
            println(ingredients)
        }
        return
    }
    println("Такого ингредиента в рецепте нет")
}
