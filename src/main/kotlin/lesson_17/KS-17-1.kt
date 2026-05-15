package org.example.lesson_17

class Quiz(question: String, answer: String) {
    var question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val question1 = Quiz("первый вопрос", "второй вопрос")

    println(question1.question)
    println(question1.answer)
}
