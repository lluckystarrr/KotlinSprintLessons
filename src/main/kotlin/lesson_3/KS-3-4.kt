package org.example.lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var stepNumber = 1
    var stepHistory = "$from - $to; $stepNumber"

    println(stepHistory)

    from = "D2"
    to = "D3"
    stepNumber++
    stepHistory = "$from - $to; $stepNumber"

    println(stepHistory)
}