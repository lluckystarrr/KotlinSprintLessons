package org.example.lesson_14

open class AstronomicalObject(
    val name: String,
    val atmosphere: Boolean,
    val suitable: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    suitable: Boolean,
    val haveSatellites: List<Satellite>,
) : AstronomicalObject(name, atmosphere, suitable)

class Satellite(
    name: String,
    atmosphere: Boolean,
    suitable: Boolean,
) : AstronomicalObject(name, atmosphere, suitable)

fun main() {
    val satellite1 = Satellite("спутник1", false, false)
    val satellite2 = Satellite("спутник2", false, false)

    val planet1 = Planet("Сатурн", false, false, listOf(satellite1, satellite2))

    println("планета: ${planet1.name}")
    println("атмосфера: ${planet1.atmosphere}")
    println("пригодна: ${planet1.suitable},")
    println("спутники: ${planet1.haveSatellites.joinToString { it.name }}")
}
