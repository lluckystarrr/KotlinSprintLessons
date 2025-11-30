package org.example.lesson_4

val SUNNY_WEATHER = true
val OPEN_TENT = true
val HUMIDITY = 20
val WRONG_SEASON = "зима"

fun main() {

    val sunnyToday = true
    val openTentToday = true
    val humidityToday = 20
    val seasonToday = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(SUNNY_WEATHER == sunnyToday) && (OPEN_TENT == openTentToday) && (HUMIDITY == humidityToday) && (WRONG_SEASON !== seasonToday)}")
}