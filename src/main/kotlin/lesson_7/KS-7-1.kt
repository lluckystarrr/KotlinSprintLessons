package org.example.lesson_7

fun main() {
    val number = 1..9
    val letter = 'a'..'z'
    var password = ""

    for (i in 1..3) {
        password += number.random()
        password += letter.random()
    }
    print(password)
}