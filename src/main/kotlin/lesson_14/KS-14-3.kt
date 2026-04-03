package org.example.lesson_14

const val PI = 3.14

abstract class Figure(val color: String) {
    abstract fun areaCalculate(): Double
    abstract fun perimeterCalculate(): Double
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun areaCalculate(): Double {
        return PI * radius * radius
    }

    override fun perimeterCalculate(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun perimeterCalculate(): Double {
        return 2 * (width + height).toDouble()
    }

    override fun areaCalculate(): Double {
        return width * height.toDouble()
    }
}

fun main() {
    val krug1 = Circle("черный", 12)
    val krug2 = Circle("белый", 11)
    val krug3 = Circle("белый", 10)
    val krug4 = Circle("черный", 9)
    val pryamougolnik1 = Rectangle("черный", 3, 3)
    val pryamougolnik2 = Rectangle("черный", 4, 4)
    val pryamougolnik3 = Rectangle("белый", 5, 5)
    val pryamougolnik4 = Rectangle("белый", 5, 5)

    val list = mutableListOf(krug1, krug2, krug3, krug4, pryamougolnik1, pryamougolnik2, pryamougolnik3, pryamougolnik4)


    val blacklist = list.filter { it.color == "черный" }.sumOf { it.perimeterCalculate() }
    val whitelist = list.filter { it.color == "белый" }.sumOf { it.areaCalculate() }


    println("сумма периметров черного $blacklist")
    println("сумма площади белого $whitelist")

}
