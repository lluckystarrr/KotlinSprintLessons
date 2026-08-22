package org.example.lesson_21

import java.io.File

fun File.writeWordToFile(word: String) {
    val lowerCaseWord = word.lowercase()
    val existingContent = this.readText()
    val newContent = "$lowerCaseWord\n$existingContent"
    this.writeText(newContent)
}
