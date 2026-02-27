package org.example.lesson_12

class Temperature3(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {
    var dayTemperature: Int
    var nightTemperature: Int
    var precipitation = precipitation

    init {
        dayTemperature = dayTemperatureKelvin-273
        nightTemperature = nightTemperatureKelvin-273
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $precipitation")
    }

}

fun main() {
    val temperature7 = Temperature3(280, 271, false)
    val temperature8 = Temperature3(290, 273, true)
}