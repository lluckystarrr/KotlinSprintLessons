package org.example.lesson_16
import kotlin.math.pow

private const val PI = 3.14

class Circle12(private val radius: Int) {

    fun countCircumference(): Double {
        return 2 * PI * radius
    }

    fun countCircleArea(): Double {
        return PI * radius.toDouble().pow(2)
    }
}

fun main() {
    val circle1 = Circle12(radius = 12)
    val circumference = circle1.countCircumference()
    val circleArea = circle1.countCircleArea()
    println(circumference)
    println(circleArea)
}
