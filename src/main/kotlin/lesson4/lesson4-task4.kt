package org.example.lesson4

fun main() {

    var trainingDay = 1
    var isHandsAndAbsDay = trainingDay % 2 == 1

    println("Упражнения для рук:    $isHandsAndAbsDay\n" +
            "Упражнения для ног:    ${!isHandsAndAbsDay}\n" +
            "Упражнения для спины:  ${!isHandsAndAbsDay}\n" +
            "Упражнения для пресса: $isHandsAndAbsDay")
}