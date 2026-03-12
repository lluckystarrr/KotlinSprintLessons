package org.example.lesson_13

class Contacts(val name: String, val number: Long, val company: String? = null) {

    fun showData() {
        println("Имя: $name, Номер: $number, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<Contacts>()
    do {
        println("Введите имя")
        val inputName = readln()

        println("Введите номер")
        val inputNumber = readln().toLongOrNull()
        if (inputNumber == null) {
            println("Вы не заполнили номер")
            return
        }

        println("Введите компанию")
        var inputCompany = readln()
        if (inputCompany == "") {
            inputCompany = null.toString()
        }

        val contact = Contacts(inputName, inputNumber, inputCompany)
        phoneBook.add(contact)

        println("Добавить еще компанию?")
        val addContact = readln()
    } while (
        addContact.equals("да", ignoreCase = true)
    )

    phoneBook.forEach { it.showData() }
}