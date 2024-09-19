package org.example.lesson1

const val SECONDS_IN_HOUR: Int = 3600
const val SECONDS_IN_MINUTE: Int = 60



fun main() {
    val secondsInSpaceGagarin: Int = 6480

    val hoursInSpace: Int = secondsInSpaceGagarin / SECONDS_IN_HOUR
    val minutesRemainder: Int = (secondsInSpaceGagarin % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondsRemainder: Int = secondsInSpaceGagarin % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesRemainder, secondsRemainder))

}