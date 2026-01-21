package org.example.lesson_11

class Info2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null,
) {
    fun outputInfo() {
    println(id)
    println(login)
    println(password)
    println(mail)
    println(bio)
    }

fun addBio(newBio: String?) {
    bio = newBio
}

fun readBio() {
    println("Введи информацию о себе:")
    val inputBio = readln()
    bio = inputBio
}

    fun changePassword() {
        println("Введите текущий пароль")
        val inputPassword = readln()

        if (inputPassword == password) {
            println("Введите новый пароль")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен!")
        } else {
            println("Пароль неверный!")
        }
    }
}

fun main() {
    val user = Info2(
        id = 1,
        login = "luckystar",
        password = "1234",
        mail = "luckystar@mail.ru",
    )
    println("Текущая информация о пользователе")
    user.outputInfo()
    user.readBio()
    user.changePassword()

    println("Обновленная информация о пользователе")
    user.outputInfo()
}
