package org.example.lesson1


fun main() {

    val secondsInSpace: Int = 6480

    val hoursInSpace: Int = secondsInSpace / 3600
    val minutesRemainder: Int = (secondsInSpace % 3600) / 60
    val secondsRemainder: Int = secondsInSpace % 60

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesRemainder, secondsRemainder))

}