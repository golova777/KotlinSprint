package org.example.lesson5

const val BOT_CHECK_SUM_VAL1 = 2
const val BOT_CHECK_SUM_VAL2 = 2

fun main() {
    print("Докажи, что ты не бот: реши пример $BOT_CHECK_SUM_VAL1 + $BOT_CHECK_SUM_VAL2...: ")
    var userInput = readln()

    if  (userInput.matches("""\d+""".toRegex()) &&
        userInput.toInt() == (BOT_CHECK_SUM_VAL2 + BOT_CHECK_SUM_VAL1)) {
            println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}