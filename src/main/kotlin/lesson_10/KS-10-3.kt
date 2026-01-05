package org.example.lesson_10

fun main() {

    println("Сколько символов должно быть в пароле?")
    val amountSymbols = readln().toInt()

    val newPassword = createPassword(amountSymbols)
    println("Ваш пароль: $newPassword")
}

fun createPassword(amountSymbols: Int): String {
    val number = 0..9
    val symbols = arrayOf("!", "\"", "#", "$", "%", "&", "(", ")", "'", "*", "+", ",", "-", ".", "/", " ")
    var password = ""

    for (i in 1..amountSymbols) {
        if (i % 2 == 0) {
            password += symbols.random()
        } else {
            password += number.random()
        }
    }
    return password
}