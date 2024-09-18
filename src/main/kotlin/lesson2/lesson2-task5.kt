package org.example.lesson2
import kotlin.math.*

const val PERCENTAGE_DIVIDER = 100
const val CURRENT_DEPOSIT_BODY = 1

fun main() {

    val startDeposit: Int = 70000
    val interestRate: Double = 16.7
    val depositYears: Int = 20

    val futureDeposit = startDeposit * (CURRENT_DEPOSIT_BODY + (interestRate / PERCENTAGE_DIVIDER)).pow(depositYears)

    println(String.format("%.3f", futureDeposit))
}