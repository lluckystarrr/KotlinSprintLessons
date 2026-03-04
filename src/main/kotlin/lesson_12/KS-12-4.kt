package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273

class Temperature3(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {
    var dayTemperature: Int
    var nightTemperature: Int
    var precipitation = precipitation

    init {
        dayTemperature = dayTemperatureKelvin - KELVIN_TO_CELSIUS
        nightTemperature = nightTemperatureKelvin - KELVIN_TO_CELSIUS
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $precipitation")
    }
}

fun main() {
    val temperature7 = Temperature3(280, 271, false)
    val temperature8 = Temperature3(290, 273, true)
}