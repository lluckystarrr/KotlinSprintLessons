package org.example.lesson_15

interface ReadForum {
    fun readForum() = println("Читать форум")
}

interface WriteMessage {
    fun writeMessage() = println("Писать сообщения")
}

interface DeleteMessage {
    fun deleteMessage() = println("Удалять сообщения")
}

interface DeleteUsers {
    fun deleteUsers() = println("Удалять пользователей")
}

abstract class User(val userType: String, val name: String) {
    fun showInfo() {
        println("Пользователь: $name, тип: $userType")
    }
}

class RegularUser(name: String) : User("обычный", name), ReadForum, WriteMessage

class Admin(name: String) : User("админ", name), ReadForum, WriteMessage, DeleteMessage, DeleteUsers

fun main() {
    val user1 = RegularUser(name = "Цветочек")
    user1.showInfo()
    user1.writeMessage()
    user1.readForum()


    val admin1 = Admin("Одмин")
    admin1.showInfo()
    admin1.readForum()
    admin1.writeMessage()
    admin1.deleteUsers()
    admin1.deleteMessage()
}
