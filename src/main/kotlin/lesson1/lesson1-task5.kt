package org.example.lesson1


fun main() {

    val secondsInHour: Int = 3600
    val secondsInMinute: Int = 60

    val secondsInSpaceGagarin: Int = 6480

    val hoursInSpace: Int = secondsInSpaceGagarin / secondsInHour
    val minutesRemainder: Int = (secondsInSpaceGagarin % secondsInHour) / secondsInMinute
    val secondsRemainder: Int = secondsInSpaceGagarin % secondsInMinute

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesRemainder, secondsRemainder))

}