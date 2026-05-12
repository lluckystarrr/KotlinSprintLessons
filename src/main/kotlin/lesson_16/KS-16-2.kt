package org.example.lesson_16
import kotlin.math.pow

private const val PI = 3.14

class Circle12(private val radius: Double) {

    fun getCountCircumference(): Double {
        return 2 * PI * radius
    }

    fun getCountCircleArea(): Double {
        return PI * radius.pow(2)
    }
}

fun main() {
    val circle1 = Circle12(radius = 12.0)
    val circumference = circle1.getCountCircumference()
    val circleArea = circle1.getCountCircleArea()
    println(circumference)
    println(circleArea)
}
