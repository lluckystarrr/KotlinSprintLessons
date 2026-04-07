package org.example.lesson_14

open class astronomicalObject(
    val name: String,
    val atmosphere: Boolean,
    val suitable: Boolean,
) {}

class planet(
    name: String,
    atmosphere: Boolean,
    suitable: Boolean,
    val haveSatellites: List<satellite>?,
) : astronomicalObject(name, atmosphere, suitable)

class satellite(
    name: String,
    atmosphere: Boolean,
    suitable: Boolean,
) : astronomicalObject(name, atmosphere, suitable)

fun main() {
    val satellite1 = satellite("спутник1", false, false)
    val satellite2 = satellite("спутник2", false, false)

    val planet1 = planet("Сатурн", false, false, listOf(satellite1, satellite2))

    println("планета: ${planet1.name}")
    println("атмосфера: ${planet1.atmosphere}")
    println("пригодна: ${planet1.suitable},")
    println("спутники: ${planet1.haveSatellites?.joinToString { it.name }}")
}
