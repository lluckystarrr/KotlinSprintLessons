package org.example.lesson_11

class Info (
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)
{
}

fun main() {
    val user1 = Info(
        id = 1,
        login = "luckystar",
        password = "1234",
        mail = "luckystar@mail.ru"
    )

    val user2 = Info(
        id = 2,
        login = "blackberry",
        password = "y4tv",
        mail = "blackberry@yandex.ru"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}