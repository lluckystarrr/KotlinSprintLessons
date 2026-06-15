package org.example.lesson_17

class Package(
    val trackingNumber: String,
    startLocation: String
) {
    var movementCount = 0
        private set

    var actualLocation = startLocation
        set(value) {
            field = value
            movementCount++
            println("Посылка $trackingNumber: перемещена в '$value' (перемещений: $movementCount)")
        }
}

fun main() {
    val package1 = Package(
        trackingNumber = "RX123456789RU",
        startLocation = "Москва"
    )

    println("Номер посылки: ${package1.trackingNumber}")
    println("Текущее местоположение: ${package1.actualLocation}")
    println("Количество перемещений: ${package1.movementCount}\n")

    package1.actualLocation = "Московская область"
    package1.actualLocation = "Тверская область"
    package1.actualLocation = "Тверь"
}
