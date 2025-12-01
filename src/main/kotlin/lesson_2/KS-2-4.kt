package org.example.lesson_2

fun main() {
    val cristal = 7
    val iron = 11
    val buffPercent = 20
    val wholePercent = 100

    val cristalBuff  = cristal * buffPercent / wholePercent
    val ironBuff = iron * buffPercent / wholePercent

    print("Кристаллическая руда: ")
    println(ironBuff)
    print("Железная руда: ")
    println(cristalBuff)
}