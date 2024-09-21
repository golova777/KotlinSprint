package org.example.lesson3

fun main() {

    var userTurnData = "D2-D4;0"

    var (fromPosition, toPosition, turnNumber) = userTurnData.split("-",";")

    println(fromPosition)
    println(toPosition)
    println(turnNumber)
}