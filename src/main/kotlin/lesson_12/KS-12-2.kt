package org.example.lesson_12

class Temperature1(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean) {

    fun showData() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $precipitation")
    }
}

fun main() {
    val temperature3 = Temperature1(
        dayTemperature = 12,
        nightTemperature = -5,
        precipitation = false,
    )

    val temperature4 = Temperature1(
        dayTemperature = 10,
        nightTemperature = -25,
        precipitation = false,
    )

    temperature3.showData()
    temperature4.showData()
}