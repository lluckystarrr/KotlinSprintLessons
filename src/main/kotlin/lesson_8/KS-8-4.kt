package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("курица", "картофель", "огурец", "морковь", "горошек")
        println(arrayOfIngredients.joinToString())

    println("Какой ингредиент заменить?")
    val changeIngredients = readln()

    val index = arrayOfIngredients.indexOf(changeIngredients)
    if (index >= 0) {
        println("На какой ингредиент заменим?")

        val inputIngredients = readln()

        arrayOfIngredients[index] = inputIngredients

        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString()}")
        return
    }
    println("Такого ингредиента в рецепте нет")
}
