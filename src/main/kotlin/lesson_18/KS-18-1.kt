package org.example.lesson_18

class Order(
    val number: Int,
    val items: List<String>
) {
    fun printInfo() {
        if (items.size == 1) {
            println("Заказан товар: ${items[0]}")
        }
        // Если в списке больше 1 товара
        else {
            // Склеиваем товары через запятую
            var result = ""
            for (item in items) {
                result += item + ", "
            }

            println("Заказаны следующие товары: $result")
        }
    }
}

fun createOrder(number: Int, item: String): Order {
    return Order(number, listOf(item))
}

fun createOrder(number: Int, item1: String, item2: String, item3: String): Order {
    return Order(number, listOf(item1, item2, item3))
}

fun main() {
    val order1 = createOrder(1, "Телефон")
    order1.printInfo()

    val order2 = createOrder(2, "Наушники", "Зарядка", "Чехол")
    order2.printInfo()
}
