package org.example.lesson_16

class Order(private val orderNumber: Int, private var orderStatus: String) {

    fun getOrderNumber(): Int {
        return orderNumber
    }

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

fun main() {
    val firstOrder = Order(1, "В процессе")
    println("Номер заказа: ${firstOrder.getOrderNumber()}")
    println("Статус заказа: ${firstOrder.getStatus()}")

    firstOrder.changeRequest("Готов к выдаче")
}
