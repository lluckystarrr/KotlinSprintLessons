package org.example.lesson_18

open class Animal(val name: String) {
    open fun eat() {
        println("$name -> ест")
    }

    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val fox = Fox("Фокс")
    val dog = Dog("Хатико")
    val cat = Cat("Эш")

    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) {
        animal.eat()
    }

    for (animal in animals) {
        animal.sleep()
    }
}
