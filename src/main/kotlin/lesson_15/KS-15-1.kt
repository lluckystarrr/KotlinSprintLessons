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

class Carp(val name: String) : SwimmingMethod
class Seagull(val name: String) : FlyingMethod
class Duck(val name: String) : FlyingMethod, SwimmingMethod

fun main() {
    val carp = Carp("карась")
    println("Существо: ${carp.name}")
    carp.swim()

    val seagull = Seagull("чайка")
    println("Существо: ${seagull.name}")
    seagull.fly()

    val duck = Duck("утка")
    println("Существо: ${duck.name}")
    duck.swim()
    duck.fly()
}
