package org.example.lesson2

fun main() {

    val trainDepartureTimeHours = 9
    val trainDepartureTimeminutes = 39
    val trainRouteTimeMinutes = 475

    val minutesSum = trainDepartureTimeminutes + trainRouteTimeMinutes
    val trainArraivingHour = trainDepartureTimeHours + ( minutesSum / 60 )
    val trainArraivingMinute = minutesSum % 60

    println("$trainArraivingHour:$trainArraivingMinute")
}