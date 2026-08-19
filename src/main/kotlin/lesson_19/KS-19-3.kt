package org.example.lesson_19

class Spaceship {
    fun takeOff() {
        // TODO: добавить логику взлета
        println("Корабль взлетает")
    }

    fun land() {
        // TODO: добавить логику посадки
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
