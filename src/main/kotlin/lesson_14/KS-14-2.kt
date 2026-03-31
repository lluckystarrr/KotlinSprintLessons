package org.example.lesson_14

open class Ship2(
    open val speed: Int = 10,
    open val carryingCapacity: Int = 10,
    open val capacity: Int = 10,
    open val breakIce: Boolean = false,
) {
    fun printInfo() {
        println("Скорость: $speed")
        println("Грузоподъемность: $carryingCapacity")
        println("Вместительность: $capacity")
        println("Возможность колоть лед: $breakIce")
    }
}

class Liner2 : Ship2() {
    override val capacity: Int = 20

    fun extentHorizontalLadder() {
        println("Способ погрузки: Выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo2 : Ship2() {
    override val speed: Int = 5
    override val carryingCapacity: Int = 15
    override val capacity: Int = 5

    fun activateLoadingCrane() {
        println("Способ погрузки: Активирует погрузочный кран")
    }
}

class Icebreaker2 : Ship2() {
    override val speed: Int = 6
    override val carryingCapacity: Int = 8
    override val capacity: Int = 5
    override val breakIce: Boolean = true

    fun openGate() {
        println("Способ погрузки: Открывает ворота со стороны кормы")
    }
}

fun main() {

    val liner2 = Liner2()
    println("Лайнер:")
    liner2.printInfo()
    liner2.extentHorizontalLadder()

    val cargo2 = Cargo2()
    println("\nГрузовой корабль:")
    cargo2.printInfo()
    cargo2.activateLoadingCrane()

    val iceBreaker2 = Icebreaker2()
    println("\nЛедокол:")
    iceBreaker2.printInfo()
    iceBreaker2.openGate()
}
