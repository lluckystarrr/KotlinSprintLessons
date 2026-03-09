package org.example.lesson_13

class Contact(val name: String, val number: Long, val company: String? = null) {

    fun showData() {
        println("Имя: $name, Номер: $number, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val companyContact = listOf(
        Contact("Максим", 89164751213),
        Contact("Андрей", 890835674378, "Березка"),
        Contact("Мария", 89163451234, "Сахарок"),
        Contact("Светална", 89178978932),
        Contact("Егор", 89165491234, "null")
    )

    companyContact.forEach {
        it.showData()
    }
}
