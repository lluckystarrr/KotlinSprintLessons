package org.example.lesson_18

abstract class Box {
    abstract fun getBoxSurfaceArea(): Int
}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int
) : Box() {
    override fun getBoxSurfaceArea(): Int {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubeBox(
    private val side: Int
) : Box() {
    override fun getBoxSurfaceArea(): Int {
        return 6 * side * side
    }
}

fun main() {
    val boxes: List<Box> = listOf(
        RectangularBox(10, 8, 5),
        CubeBox(6)
    )

    for (box in boxes) {
        println("Площадь поверхности: ${box.getBoxSurfaceArea()}")
    }
}