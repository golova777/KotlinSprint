package org.example.lesson2
import kotlin.math.*


fun main() {

    val startDeposit = 70000
    val interestRate = 16.7
    val depositYears = 20

    val futureDeposit = startDeposit * (1 + (interestRate / 100)).pow(depositYears)

    println(String.format("%.3f", futureDeposit))
}