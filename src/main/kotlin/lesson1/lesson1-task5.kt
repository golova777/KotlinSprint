package org.example.lesson1

const val SECONDS_IN_HOUR: Int = 3600
const val SECONDS_IN_MINUTE: Int = 60
const val SECONDS_IN_SPACE_GAGARIN: Int = 6480


fun main() {
    val hoursInSpace: Int = SECONDS_IN_SPACE_GAGARIN / SECONDS_IN_HOUR
    val minutesRemainder: Int = (SECONDS_IN_SPACE_GAGARIN % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondsRemainder: Int = SECONDS_IN_SPACE_GAGARIN % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesRemainder, secondsRemainder))

}