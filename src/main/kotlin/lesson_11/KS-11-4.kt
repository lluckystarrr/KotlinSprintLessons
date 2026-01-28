package org.example.lesson_11

class RecipeCategory(
    val backgroundImageCategory: String,
    val titleCategory: String,
    val dishImage: String,
    val dishName: String,
    val recipes: List<Recipe>
)

class Recipe(
    val recipeImage: String,
    val recipeId: Int,
    val recipeTitle: String,
    val ingredients: List<Ingredient>,
    var numberOfServings: Int = 1,
    val cookingMethod: String,
    var inFavorite: Boolean = false,
)
{
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

class Ingredient(
    val name: String,
    val amount: Int,
    val measure: String,
)
