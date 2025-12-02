package org.example.lesson_4

const val AVARAGE_MIN_KG = 35
const val AVARAGE_MAX_KG = 100
const val AVARAGE_MAX_L = 100

fun main() {

    val firstCargoKg = 20
    val firstCargoL = 80
    val secondCargoKg = 50
    val secondCargoL = 100

    val correctFirstCargo = (firstCargoKg > AVARAGE_MIN_KG) &&
            (firstCargoKg <= AVARAGE_MAX_KG) &&
            (firstCargoL < AVARAGE_MAX_L)

    val correctSecondCargo = (secondCargoKg > AVARAGE_MIN_KG) &&
            (secondCargoKg <= AVARAGE_MAX_KG) &&
            (secondCargoL < AVARAGE_MAX_L)

    println("Груз с весом $firstCargoKg кг и объемом $firstCargoL л соответствует категории Average: $correctFirstCargo")

    println("Груз с весом $firstCargoKg кг и объемом $firstCargoL л соответствует категории Average: $correctSecondCargo")
}