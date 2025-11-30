package org.example.Lesson_2

fun main() {

    val workers = 50
    var workersSalary = 30000
    val intern = 30
    val internsSalary = 20000
    val allWorkersSalaries = workersSalary * workers

    println(allWorkersSalaries)

    val allInternsSalaries = internsSalary * intern

    println(allWorkersSalaries + allInternsSalaries)

    val allPeople = intern + workers
    val allSalaries = allWorkersSalaries + allInternsSalaries

    println(allSalaries / allPeople)
}