package org.example.lesson_16

class Order(val orderNumber: Int, private var orderStatus: String) {
    fun getStatus(): String {
        return orderStatus
    }

    private fun changeStatus(newStatus: String) {
        orderStatus = newStatus
        println("Статус изменен: $newStatus")
    }

    fun changeRequest(newStatus: String) {
        println("Отправить заявку на смену статуса")
        changeStatus(newStatus)
    }
}

fun changeApplication(order: Order, newStatus: String) {
    order.changeRequest(newStatus)
}

fun main() {
    val firstOrder = Order(1, "В процессе")
    println("Номер заказа: ${firstOrder.orderNumber}")
    println("Статус заказа: ${firstOrder.getStatus()}")

    changeApplication(firstOrder, "Готов к выдаче")
}
