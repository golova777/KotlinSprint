package org.example.lesson2

const val PERCENTAGE_DIVIDER_ = 100


fun main() {
    val buffEffectValue = 20.0f
    val crystalOreValue = 7
    val ironOreValue = 11

    val buffEffectFactor = (buffEffectValue / PERCENTAGE_DIVIDER_)
    val buffedCrystalOreValue = crystalOreValue * buffEffectFactor
    val buffedIronOreValue = ironOreValue * buffEffectFactor

    println("Бафф кристаллической руды: ${buffedCrystalOreValue.toInt()}")
    println("Бафф Железной руды: ${buffedIronOreValue.toInt()}")
}