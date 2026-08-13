package org.example.lesson_19

enum class Category(val displayName: String) {

    CLOTH("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное");

    fun getName(): String {
        return displayName
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {

    fun printInfo() {
        println("Товар: $name")
        println("ID: $id")
        println("Категория: ${category.getName()}")
    }
}

fun main() {

    val tshirt = Product("Футболка", 101, Category.CLOTH)

    val pen = Product("Ручка", 205, Category.STATIONERY)

    val phoneCase = Product("Чехол", 309, Category.OTHER)

    val pants = Product("Джинсы", 102, Category.CLOTH)

    tshirt.printInfo()
    pen.printInfo()
    phoneCase.printInfo()
    pants.printInfo()
}
