package org.example.lesson5

const val ADULTHOOD_AGE = 18
const val CURRENT_YEAR = 2024

fun main() {
    val currentYear = 2024

    print("Введи год своего рождения (прим: 1970): ")
    val userInputAge = readln()

    if (userInputAge.matches("""\d\d\d\d""".toRegex()) &&
        (CURRENT_YEAR - userInputAge.toInt() >= ADULTHOOD_AGE) ) {
            println("Показать экран со скрытым контентом")
    }
}