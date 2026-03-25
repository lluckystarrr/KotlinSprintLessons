package org.example.lesson_14

open class Ship(
    val speed: Int = 10,
    val carryingCapacity: Int = 10,
    val capacity: Int = 10,
    val breakIce: Boolean = false,
)

class Liner(
    speed: Int,
    carryingCapacity: Int,
    capacity: Int,
) : Ship(speed, carryingCapacity, capacity)

class Cargo(
    speed: Int,
    carryingCapacity: Int,
    capacity: Int
) : Ship(speed, carryingCapacity, capacity)

class Icebreaker(
    speed: Int,
    carryingCapacity: Int,
    capacity: Int,
) : Ship(speed, carryingCapacity, capacity, breakIce = true)

fun main() {

    val liner1 = Liner(10, 10, 10)
    val cargo1 = Cargo(5, 15, 5)
    val iceBreaker1 = Icebreaker(6, 8, 5)

}
