package org.example.lesson_22

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)

fun main() {
    val regular1 = RegularBook("Пес и кошка", "Ринатова")
    val regular2 = RegularBook("Пес и кошка", "Ринатова")

    val data1 = DataBook("Пес и кошка", "Ринатова")
    val data2 = DataBook("Пес и кошка", "Ринатова")

    println("Обычный класс: ${regular1 == regular2}")
    println("Data class: ${data1 == data2}")
}

//RegularBook -> false
//- Обычный класс сравнивает сами объекты (разные объекты, получаем false)
//
//DataBook -> true
//- Data class сравнивает данные внутри объектов (данные одинаковые, получаем true)
