package org.example.lesson_15

interface FlyingMethod {
    fun fly() {
        println("Способ передвижения: летать")
    }
}
    interface SwimmingMethod {
        fun swim() {
        println("Способ передвижения: плыть")
    }
}

class FlyingCreatures (val name: String) : FlyingMethod {}

class SwimmingCreatures (val name: String) : SwimmingMethod {}

fun main() {
    val carp = SwimmingCreatures("карась")
    println("Существо: ${carp.name}")
    carp.swim()

    val seagull = FlyingCreatures("чайка")
    println("Существо: ${seagull.name}")
    seagull.fly()

    val duck = SwimmingCreatures("утка")
    println("Существо: ${duck.name}")
    duck.swim()
}
