package org.example.lesson4

fun main() {
    var isSunnyToday: Boolean = true
    var isTentOpen: Boolean = true
    var airHumidityPercentage: Int = 20
    var currentSeason: String = "зима"

    var isBeanConditionsOK = isSunnyToday && isTentOpen && airHumidityPercentage == 20 && currentSeason != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isBeanConditionsOK")
}