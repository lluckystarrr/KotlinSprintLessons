package org.example.lesson_13

class Info1 (val name: String, val number: Long, val company: String? = null)
{
    fun showData(){
        println("Имя: $name, Номер: $number, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact1 = Info1("Максим", 89164751213)
    val contact2 = Info1("Алексей", 890835674378, "Березка")

    contact1.showData()
    contact2.showData()
}