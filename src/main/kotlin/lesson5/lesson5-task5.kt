package org.example.lesson5

import kotlin.random.Random


const val RANGE_START = 0
const val RANGE_STOP = 42


fun main() {
    val secretNumbersList = listOf(Random.nextInt(RANGE_START, RANGE_STOP+1),
                                   Random.nextInt(RANGE_START, RANGE_STOP+1),
                                   Random.nextInt(RANGE_START, RANGE_STOP+1))

    var userInputList: List<Int> = listOf()

    println("Угадай три числа в диапазоне от $RANGE_START до $RANGE_STOP")
    print("число №1: ")
    userInputList = userInputList + readln().toInt()
    print("число №2: ")
    userInputList = userInputList + readln().toInt()
    print("число №3: ")
    userInputList = userInputList + readln().toInt()
    val guessedNumbersCount = userInputList.intersect(secretNumbersList).size

    val lotteryResultMessage = when(guessedNumbersCount) {
        3 -> "Вы угадали все три числа и выиграли джекпот"
        2 -> "Вы угадали два числа и получаете крупный приз"
        1 -> "Вы угадали одно число и вам выплачивается утешительный приз"
        else -> "Вы не угадали ни одного числа"
    }
    println("$lotteryResultMessage.\n" +
            "Загаданные числа были:\n" +
            "${secretNumbersList[0]}\n" +
            "${secretNumbersList[1]}\n" +
            "${secretNumbersList[2]}")
}