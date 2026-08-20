package org.example.lesson_20

class Player1(
    val name: String,
    var hasKey: Boolean,
)

val checkKey: (Player1) -> String = { player ->
    if (player.hasKey) {
        "Игрок открыл дверь"
    } else {
        "Дверь заперта"
    }
}

fun main() {
    val playerWithoutKey = Player1("Сашка", false)

    val playerWithKey = Player1("Мария", true)

    val result1 = checkKey(playerWithoutKey)
    println("${playerWithoutKey.name} -  $result1")

    val result2 = checkKey(playerWithKey)
    println("${playerWithKey.name} -  $result2")
}
