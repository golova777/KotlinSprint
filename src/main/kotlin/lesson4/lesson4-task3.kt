package org.example.lesson4

const val OPTIMAL_HUMIDITY = 20
const val RISKY_SEASON = "зима"


fun main() {
    var isSunnyToday: Boolean = true
    var isTentOpen: Boolean = true
    var airHumidityPercentage: Int = 20
    var currentSeason: String = "зима"

    var isBeanConditionsOK = isSunnyToday &&
                             isTentOpen &&
                             airHumidityPercentage == OPTIMAL_HUMIDITY &&
                             currentSeason != RISKY_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isBeanConditionsOK")
}