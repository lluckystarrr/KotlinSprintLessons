package org.example.lesson_11

class RecipeCategory(
    val backgroundImageCategory: String,
    val titleCategory: String,
    val dishImage: String,
    val dishName: String,
)

class Recipe(
    val cookingMethod: String,
)

class Ingredients(
    val backgroundImageIng: String,
    val titleIng: String,
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
