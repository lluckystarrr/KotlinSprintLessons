package org.example.lesson_4

val SUNNY_WEATHER = true
val OPEN_TENT = true
val HUNIDITY = 20
val SEASON = "!зима"

fun main() {

    val sunnyToday = true
    val openTentToday = true
    val hunidityToday = 20
    val seasonToday = "зима"

    println(SUNNY_WEATHER == sunnyToday && OPEN_TENT == openTentToday && HUNIDITY == hunidityToday && SEASON == seasonToday)
}