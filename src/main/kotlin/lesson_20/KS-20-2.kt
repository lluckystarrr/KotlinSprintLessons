package org.example.lesson_20

class Player (
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val potion: (Player) -> Unit = { player -> player.currentHealth = player.maxHealth
    println("${player.name} выпил зелье. Здоровье восстановлено до ${player.maxHealth}")
}

fun main() {
    val player1 = Player("Игрок1", 15, 100)
    potion(player1)
}
