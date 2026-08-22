package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(numbers1.evenNumbersSum())
}
