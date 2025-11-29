package org.example.lesson_2

fun main() {

val departureHour = 9
val departureMin = 39
val durationMin = 457

val durationHourMin = 457 / 60
val totalDepartureMin = departureHour * 60 + departureMin
val totalArrivalMin = totalDepartureMin + durationMin
val arrivalHour = totalArrivalMin / 60

val arrivalMin = totalArrivalMin % 60

    println("$arrivalHour:$arrivalMin")
}
