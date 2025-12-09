package org.example.lesson_4

fun main() {

    val trainingDay = 1

    val isEven = trainingDay % 2 == 0
    val armsDay = isEven
    val pressDay = isEven
    val legsDay = !isEven
    val backDay = !isEven

    println("""
        Упражнения для рук: $armsDay
        Упражнения для пресса: $pressDay
        Упражнения для ног: $legsDay
        Упражнения для спины: $backDay
    """.trimIndent()
            )
}