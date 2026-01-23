package org.example.lesson_11

class RecipeCategory(
    val backgroundImage: String,
    val title: String,
    val dishImage: String,
    val dishName: String,
)

class Recipe(
    val cookingMethod: String,
)

class Ingredients(
    val backgroundImage1: String,
    val title1: String,
    var numberOfServings: Int,
    val ingredients: List<String>,
    var inFavorite: Boolean = false,
) {
    fun addToFavorite() {
        inFavorite = true
    }

    fun removeFromFavorite() {
        inFavorite = false
    }

    fun numberOfServings() {
        println("изменение количества порций")
        numberOfServings = readln().toInt()
    }
}
