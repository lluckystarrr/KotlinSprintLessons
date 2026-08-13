package org.example.lesson_19

class Spaceship {
    fun takeOff() {
        println("Корабль взлетает")
    }

    fun land() {
        println("Корабль приземляется")
    }

    fun shootAsteroid() {
        TODO("Реализовать логику отстрела от астероида")
    }
}

fun main() {
    val ship = Spaceship()

    ship.takeOff()
    ship.land()
    ship.shootAsteroid()
}
