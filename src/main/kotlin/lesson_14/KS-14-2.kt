package org.example.lesson_14

//Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
//
//Каждый тип корабля обладает уникальным способом погрузки:
//
//- лайнер выдвигает горизонтальный трап со шкафута;
//- грузовой корабль активирует погрузочный кран;
//- ледокол открывает ворота со стороны кормы.
//
//Реализуй методы погрузки, специфичные для каждого вида корабля.
//
//Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.

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

    val liner1 = Liner2(10, 10, 10)
    println("Лайнер:")
    liner1.printInfo()
    liner1.extentHorizontalLadder()

    val cargo1 = Cargo2(5, 15, 5)
    println("\nГрузовой корабль:")
    cargo1.printInfo()
    cargo1.activateLoadingCrane()

    val iceBreaker1 = Icebreaker2(6, 8, 5)
    println("\nЛедокол:")
    iceBreaker1.printInfo()
    iceBreaker1.openGate()
}
