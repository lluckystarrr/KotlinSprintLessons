package org.example.lesson_13

class Contact(val name: String, val number: Long, val company: String? = null) {

    fun showData() {
        println("Имя: $name, Номер: $number, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<Contact>()

    do {
        println("Введите имя")
        val inputName = readln()

        println("Введите номер")
        val inputNumber = readln().toLongOrNull()

        if (inputNumber == null) {
            println("Вы не заполнили номер")
            println("Добавить еще контакт?")
            continue
        }

        println("Введите компанию")
        val inputCompany = readln()
        val company = inputCompany.ifEmpty { null }

        val contact = Contact(inputName, inputNumber, company)
        phoneBook.add(contact)

        println("Добавить еще контакт?")
    } while (readln().equals("да", ignoreCase = true))

    phoneBook.forEach { it.showData() }
}
