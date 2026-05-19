package org.example.lesson_17

class Spaceship(name: String, speed: Int, port: String) {
    var name = name
        set(value) {
            if (value != field) {
                println("невозможно изменить имя!")
            }
        }
}

fun main() {
    val firstSpaceship = Spaceship("первый корабль", 12, "первый порт")
    println(firstSpaceship.name)
    firstSpaceship.name = "новое имя"
}