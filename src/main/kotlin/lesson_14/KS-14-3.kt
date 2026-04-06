package org.example.lesson_14
import kotlin.math.PI

const val COLOR_BLACK = "черный"
const val COLOR_WHITE = "белый"

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
    val krug1 = Circle(COLOR_BLACK, 12)
    val krug2 = Circle(COLOR_WHITE, 11)
    val krug3 = Circle(COLOR_WHITE, 10)
    val krug4 = Circle(COLOR_BLACK, 9)
    val pryamougolnik1 = Rectangle(COLOR_BLACK, 3, 3)
    val pryamougolnik2 = Rectangle(COLOR_BLACK, 4, 4)
    val pryamougolnik3 = Rectangle(COLOR_WHITE, 5, 5)
    val pryamougolnik4 = Rectangle(COLOR_WHITE, 5, 5)

    val list = listOf(krug1, krug2, krug3, krug4, pryamougolnik1, pryamougolnik2, pryamougolnik3, pryamougolnik4)

    val blacklist = list.filter { it.color == COLOR_BLACK }.sumOf { it.perimeterCalculate() }
    val whitelist = list.filter { it.color == COLOR_WHITE }.sumOf { it.areaCalculate() }

    println("сумма периметров черного $blacklist")
    println("сумма площади белого $whitelist")

}
