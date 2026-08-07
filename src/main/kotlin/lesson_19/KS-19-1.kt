package org.example.lesson_19

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING("Петушок"),
}

fun main() {
    println("Вы можете добавить в аквариум этих рыбок:")
    for (fish in Fish.entries) {
        println(fish.fishName)
    }
}
