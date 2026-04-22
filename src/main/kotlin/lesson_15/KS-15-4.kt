package org.example.lesson_15

interface Search {
    fun searchComponent(components: List<Component>)
}

abstract class Goods(val name: String, val number: Int)

class Component(name: String, number: Int) : Goods(name, number)

class Instrument(name: String, number: Int) : Goods(name, number), Search {
    override fun searchComponent(components: List<Component>) {
        println("Выполняется поиск")
    }
}

fun main() {
    val keys = Component("клавиши", 100)
    val pedal = Component("педаль", 50)
    val string = Component("струна", 200)
    val pick = Component("медиатор", 10)

    val allComponents = listOf(string, pick, keys, pedal)

    val guitar = Instrument("гитара", 3)
    val piano = Instrument("пианино", 2)

    guitar.searchComponent(allComponents)
    piano.searchComponent(allComponents)
}
