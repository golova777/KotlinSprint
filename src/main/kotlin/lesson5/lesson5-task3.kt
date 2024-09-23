package org.example.lesson5

const val RANGE_START = 0
const val RANGE_STOP = 42


fun main() {
    val secretNumber1 = 33
    val secretNumber2 = 34

    val userInputNumber1: Int
    val userInputNumber2: Int

    println("Угадай число в диапазоне от $RANGE_START до $RANGE_STOP!!!")
    print("число 1: ")
    userInputNumber1 = readln().toInt()
    print("число 2: ")
    userInputNumber2 = readln().toInt()

    if ((userInputNumber1 == secretNumber1 && userInputNumber2 == secretNumber2) ||
        (userInputNumber2 == secretNumber1 && userInputNumber1 == secretNumber2) ) {
            println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userInputNumber1 == secretNumber1 || userInputNumber1 == secretNumber2) ||
               (userInputNumber2 == secretNumber1 || userInputNumber2 == secretNumber2 ) ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}