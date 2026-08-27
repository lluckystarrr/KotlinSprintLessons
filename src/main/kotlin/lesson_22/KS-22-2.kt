package org.example.lesson_22

class RegularBook2(val title: String, val author: String)
data class DataBook2(val title: String, val author: String)

fun main() {
    val regularBook = RegularBook2("Пес и кошка", "Ринатова")
    val dataBook = DataBook2("Пес и кошка", "Ринатова")

    println("Обычный класс: $regularBook")
    println("Data class: $dataBook")
}

//- Обычный класс выведет org.example.lesson_22.RegularBook2@34c45dca, т.к выведет имя класса и адрес в памяти, он использует стандартный вывод
// - А Data class печатает имя класса и все данные внутри, т.к. создает красивый вывод со всеми полями
