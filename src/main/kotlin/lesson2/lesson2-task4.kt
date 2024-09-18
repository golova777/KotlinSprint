package org.example.lesson2

const val PERCENTAGE_DIVIDER = 100


fun main() {

    val buffEffectValue = 20.0f
    val crystalOreValue = 7
    val ironOreValue = 11

    val buffedCrystalOreValue = crystalOreValue * (buffEffectValue / PERCENTAGE_DIVIDER)
    val buffedIronOreValue = ironOreValue * (buffEffectValue / PERCENTAGE_DIVIDER)


    println("Бафф кристаллической руды: ${buffedCrystalOreValue.toInt()}")
    println("Бафф Железной руды: ${buffedIronOreValue.toInt()}")
}