package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun loadAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен патронами: ${ammo.name} (урон: ${ammo.damage})")
    }

    fun fire() {
        val ammo = currentAmmo

        if (ammo != null) {
            println("Нанесен урон: ${ammo.damage} единиц")
        } else {
            println("Танк не заряжен")
        }
    }
}

fun main() {
    val tank = Tank()

    println("Первый выстрел")
    tank.fire()

    tank.loadAmmo(Ammo.BLUE)
    println("Второй выстрел. Стреляем синими")
    tank.fire()

    tank.loadAmmo(Ammo.GREEN)
    println("Третий выстрел. Стреляем зелеными")
    tank.fire()
}
