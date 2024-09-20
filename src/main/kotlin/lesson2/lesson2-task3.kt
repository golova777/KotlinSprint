package org.example.lesson2

const val SECONDS_IN_MINUTE = 60


fun main() {

    val trainDepartureTimeHours = 9
    val trainDepartureTimeMinutes = 39
    val trainRouteTimeMinutes = 475

    val minutesSum = trainDepartureTimeMinutes + trainRouteTimeMinutes
    val trainArrivingHour = trainDepartureTimeHours + ( minutesSum / SECONDS_IN_MINUTE )
    val trainArrivingMinute = minutesSum % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d", trainArrivingHour, trainArrivingMinute))
}