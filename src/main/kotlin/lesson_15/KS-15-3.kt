package org.example.lesson_15

abstract class User(val name: String) {

    fun readForum() {
        println("Читать форум")
    }

    fun writeMessage() {
        println("Писать сообщения")
    }

    fun showInfo() {
        println("Пользователь: $name")
    }
}

class RegularUser(name: String) : User(name)

class Admin(name: String) : User(name) {

    fun deleteMessage() {
        println("Удалять сообщения")
    }

    fun deleteUser() {
        println("Удалять пользователей")
    }
}

fun main() {
    val user1 = RegularUser("Цветочек")
    user1.showInfo()
    user1.readForum()
    user1.writeMessage()

    val admin1 = Admin("Одмин")
    admin1.showInfo()
    admin1.readForum()
    admin1.writeMessage()
    admin1.deleteMessage()
    admin1.deleteUser()
}
