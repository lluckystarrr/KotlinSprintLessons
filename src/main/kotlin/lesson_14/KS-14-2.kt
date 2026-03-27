package org.example.lesson_14

open class Ship2(
    val speed: Int = 10,
    val carryingCapacity: Int = 10,
    val capacity: Int = 10,
    val breakIce: Boolean = false,
) {
    fun printInfo() {
        println("Скорость: $speed")
        println("Грузоподъемность: $carryingCapacity")
        println("Вместительность: $capacity")
        println("Возможность колоть лед: $breakIce")
    }
}

class Liner2(
    speed: Int,
    carryingCapacity: Int,
    capacity: Int,
) : Ship2(speed, carryingCapacity, capacity) {
    fun extentHorizontalLadder() {
        println("Способ погрузки: Выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo2(
    speed: Int,
    carryingCapacity: Int,
    capacity: Int
) : Ship2(speed, carryingCapacity, capacity) {
    fun activateLoadingCrane() {
        println("Способ погрузки: Активирует погрузочный кран")
    }
}

class Icebreaker2(
    speed: Int,
    carryingCapacity: Int,
    capacity: Int,
) : Ship2(speed, carryingCapacity, capacity, breakIce = true) {
    fun openGate() {
        println("Способ погрузки: Открывает ворота со стороны кормы")
    }
}

fun main() {

    val liner2 = Liner2(10, 10, 10)
    println("Лайнер:")
    liner2.printInfo()
    liner2.extentHorizontalLadder()

    val cargo2 = Cargo2(5, 15, 5)
    println("\nГрузовой корабль:")
    cargo2.printInfo()
    cargo2.activateLoadingCrane()

    val iceBreaker2 = Icebreaker2(6, 8, 5)
    println("\nЛедокол:")
    iceBreaker2.printInfo()
    iceBreaker2.openGate()
}
