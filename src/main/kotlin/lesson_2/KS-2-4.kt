package org.example.lesson_2

fun main() {
    val cristal = 7
    val iron = 11
    val buffPercsent = 20

    val cristalBuff  = cristal * buffPercsent / 100
    val ironBuff = iron * buffPercsent / 100

    print("Кристаллическая руда: ")
    println(ironBuff)
    print("Железная руда: ")
    println(cristalBuff)
}