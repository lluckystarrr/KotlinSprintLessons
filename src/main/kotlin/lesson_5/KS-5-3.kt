package org.example.lesson_5

const val FIRST_NUMBER = 13
const val SECOND_NUMBER = 19
const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {

    println("Введи первое число от $MIN_NUMBER до $MAX_NUMBER")
    val firstUserNumber = readln().toInt()

    println("Введи второе число от $MIN_NUMBER до $MAX_NUMBER")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == FIRST_NUMBER && secondUserNumber == SECOND_NUMBER) ||
        (firstUserNumber == SECOND_NUMBER && secondUserNumber == SECOND_NUMBER)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstUserNumber == FIRST_NUMBER || secondUserNumber == SECOND_NUMBER) ||
        (firstUserNumber == SECOND_NUMBER || secondUserNumber == SECOND_NUMBER)
    ) {
        println("Вы выиграли утешительный приз!")
        println("Выигрышные числа - $FIRST_NUMBER, $SECOND_NUMBER")
    } else {
        println("Неудача!")
        println("Выигрышные числа - $FIRST_NUMBER, $SECOND_NUMBER")
    }
}