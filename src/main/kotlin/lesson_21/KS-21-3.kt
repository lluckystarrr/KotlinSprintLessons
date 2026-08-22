package org.example.lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player1 = Player("Игрок1", 100, 100)
    val player2 = Player("Игрок2", 50, 100)

    println("isHealthy = ${player1.isHealthy()}")
    println("isHealthy = ${player2.isHealthy()}")
}
