package org.example.lesson_12

class Temperature2(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, precipitation: Boolean) {
    var dayTemperature: Int
    var nightTemperature: Int
    var precipitation = precipitation

    init {
        dayTemperature = dayTemperatureKelvin-273
        nightTemperature = nightTemperatureKelvin-273
    }

    fun showData() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $precipitation")
    }
}

fun main() {
    val temperature5 = Temperature2(280, 271, false)
    val temperature6 = Temperature2(290, 273, true)

    temperature5.showData()
    temperature6.showData()
}