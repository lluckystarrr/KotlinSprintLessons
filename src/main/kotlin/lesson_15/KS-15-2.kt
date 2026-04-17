package org.example.lesson_15

class WeatherServer {
    fun sendInfo(data: WeatherStationStats) {
        if (data is Temperature) {
            println("Температура ${data.value} градусов")
        } else {
            println("Осадки ${data.value} мм")
        }
    }
}

abstract class WeatherStationStats(val value: Int)

class Temperature(value: Int) : WeatherStationStats(value)

class PrecipitationAmount(value: Int) : WeatherStationStats(value)

fun main() {
    val server = WeatherServer()

    val dayTemperature = Temperature(32)
    val dayPrecipitationAmount = PrecipitationAmount(10)

    server.sendInfo(dayTemperature)
    server.sendInfo(dayPrecipitationAmount)
}