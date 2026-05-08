package org.example.lesson_16

class Circle12(private val radius: Int) {
    private val PI = 3.14

    fun countCircumference(): Double {
        return 2 * PI * radius
    }

    fun countCircleArea(): Double {
        return PI * radius * radius
    }
}
    fun main() {
        val circle1 = Circle12(radius = 12)
        val circumference = circle1.countCircumference()
        val circleArea = circle1.countCircleArea()
        println(circumference)
        println(circleArea)
    }
