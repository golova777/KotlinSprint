package org.example.lesson5

const val BOT_CHECK_TASK = "2+2="
const val BOT_CHECK_RESULT = 4


fun main() {
    print("Докажи, что ты не бот: реши пример $BOT_CHECK_TASK...: ")
    var userInput = readln()

    if  (userInput.matches("""\d+""".toRegex()) &&
        userInput.toInt() == BOT_CHECK_RESULT) {
            println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}