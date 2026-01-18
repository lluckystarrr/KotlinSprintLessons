package org.example.lesson_11

//Скопируй класс User из первой задачи и назови User2.
//Добавь к классу новое необязательное свойство bio и несколько методов:
//
//- вывод информации о пользователе в консоль;
//- считывание из консоли текста и запись в поле bio;
//- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый.
//Записать его в поле и сообщить, что пароль изменен;
//
//Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи обновленную информацию о пользователе.
class Info2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
)
{
    val bio: String

    init {
        bio = readingBio()
    }

    fun outputInfo() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun readingBio(): String {
        println("Введи информацию о себе")
        return readln()
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

    user.changePassword()

    println("Обновленная информация о пользователе")
    user.outputInfo()
}
