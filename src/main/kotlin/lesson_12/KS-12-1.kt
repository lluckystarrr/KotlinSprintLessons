package org.example.lesson_12

class Temperature {
    var dayTemperature = 0
    var nightTemperature = 0
    var precipitation = false

    fun showData() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $precipitation")
    }
}

fun main() {
    val temperature1 = Temperature()
    temperature1.dayTemperature = 12
    temperature1.nightTemperature = -13
    temperature1.precipitation = true

    val temperature2 = Temperature()
    temperature2.dayTemperature = 10
    temperature2.nightTemperature = -15
    temperature2.precipitation = false

    temperature1.showData()
    temperature2.showData()
}
