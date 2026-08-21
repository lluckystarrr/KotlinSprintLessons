package org.example.lesson_20

val elements = listOf("Плей", "Пауза", "Скип вперед", "Скип назад")


val clickActions: List<() -> Unit> = elements.map { element ->
    { println("Нажат элемент $element") }
}

fun main() {
    for (it in elements.indices) {
        if (it % 2 == 0) {
            clickActions[it]()
        }
    }
}
