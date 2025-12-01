package org.example.lesson_2

fun main() {

val departureHour = 9
val departureMin = 39
val durationMin = 457
val minutesInHour = 60

val durationHourMin = durationMin / minutesInHour
val totalDepartureMin = departureHour * minutesInHour + departureMin
val totalArrivalMin = totalDepartureMin + durationMin
val arrivalHour = totalArrivalMin / minutesInHour

val arrivalMin = totalArrivalMin % minutesInHour

    println("$arrivalHour:$arrivalMin")
}
