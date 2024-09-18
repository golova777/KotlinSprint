package org.example.lesson2

const val SECONDS_IN_MINUTE = 60


fun main() {

    val trainDepartureTimeHours = 9
    val trainDepartureTimeminutes = 39
    val trainRouteTimeMinutes = 475

    val minutesSum = trainDepartureTimeminutes + trainRouteTimeMinutes
    val trainArraivingHour = trainDepartureTimeHours + ( minutesSum / SECONDS_IN_MINUTE )
    val trainArraivingMinute = minutesSum % SECONDS_IN_MINUTE


    println(String.format("%02d:%02d", trainArraivingHour, trainArraivingMinute))
}