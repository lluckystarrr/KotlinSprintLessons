package org.example.lesson_18

open class Dice(val sides: Int) {
    fun roll() {
        val result = (1..sides).random()
        println("кидаем кубик")
        println("значение $result")
    }
}

class Dice4 : Dice(4)
class Dice6 : Dice(6)
class Dice8 : Dice(8)

fun main() {
    val diceList: List<Dice> = listOf(Dice4(), Dice6(), Dice8())

    for (dice in diceList) {
        dice.roll()
    }
}
