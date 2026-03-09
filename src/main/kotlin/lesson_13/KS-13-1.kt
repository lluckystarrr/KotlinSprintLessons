package org.example.lesson_13

class Info (val name: String, val number: Long, val company: String?,)

{
    fun showData(){
        println("Имя: $name, Номер: $number, Компания: $company")
    }
}
fun main() {
    val contact1 = Info("Максим", 89164751213, null)
    val contact2 = Info("Алексей", 890835674378, "Березка")

    contact1.showData()
}