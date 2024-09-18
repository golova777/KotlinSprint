package org.example.lesson2

fun main() {

    val buffEffectValue = 0.2f
    val crystalOreValue = 7
    val ironOreValue = 11

    val buffedCrystalOreValue = crystalOreValue * buffEffectValue
    val buffedIronOreValue = ironOreValue * buffEffectValue


    println("Бафф кристаллической руды: ${buffedCrystalOreValue.toInt()}")
    println("Бафф Железной руды: ${buffedIronOreValue.toInt()}")
}