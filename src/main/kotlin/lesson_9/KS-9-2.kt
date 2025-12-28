package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("курица", "картофель", "огурец")
    println("В рецепте есть базовые ингредиенты: ")
    listOfIngredients.forEach {
        println(it)
    }
    println("Желаете добавить еще?")
    val addIngredient = readln()

    if (addIngredient.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val inputIngredient = readln()

        listOfIngredients.add(inputIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ")
        listOfIngredients.forEach {
            println(it)
        }
    }
}
