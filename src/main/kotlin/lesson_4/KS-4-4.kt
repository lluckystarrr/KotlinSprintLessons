package org.example.lesson_4

fun main() {

    val trainingDay = 1

    val armsDay = trainingDay % 2 == 0
    val pressDay = trainingDay % 2 == 0
    val legsDay = !armsDay
    val backDay = !pressDay

    println("""
        Упражнения для рук: $armsDay
        Упражнения для пресса: $pressDay
        Упражнения для ног: $legsDay
        Упражнения для спины: $backDay
    """.trimIndent()
            )
}