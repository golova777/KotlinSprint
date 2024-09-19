package org.example.lesson3

fun main() {

    var userTurnData = "D2-D4;0"

    var chessRoute = userTurnData.split(";")[0]
    var turnNumber = userTurnData.split(";")[1].toInt()

    var fromPosition = chessRoute.split('-')[0]
    var toPosition = chessRoute.split('-')[1]


    println(fromPosition)
    println(toPosition)
    println(turnNumber)
}