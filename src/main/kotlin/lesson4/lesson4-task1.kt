package org.example.lesson4

const val TOTAL_SEATS = 13

fun main() {
    var todayOrders = 13
    var tommorowOrders = 9
    var todayFreeSeats = TOTAL_SEATS - todayOrders
    var tommorowFreeSeats = TOTAL_SEATS - tommorowOrders

    println("Доступность столиков на сегодня: ${todayFreeSeats > 0}" +
            "\n" +
            "Доступность столиков на завтра: ${tommorowFreeSeats > 0}")
}