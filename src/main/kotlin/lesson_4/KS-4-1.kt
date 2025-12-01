package org.example.lesson_4
const val TABLES = 13

fun main() {

    val todayBook = 13
    val tommorowBook = 9

    val availableTableToday: Boolean = todayBook < TABLES
    val availableTableTommorow: Boolean = tommorowBook < TABLES

    println("Доступно столиков сегодня: $availableTableToday\nДоступно столиков завтра: $availableTableTommorow")
}