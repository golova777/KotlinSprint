package org.example.lesson4

const val MIN_CREW = 55
const val RECOMENDED_CREW = 70
const val OPTIMAL_PROVISION_BOXES = 50


fun main() {
    print("Есть наличие повреждений корпуса? (да/нет): ")
    var isHullBreached: Boolean = readln() == "да"
    print("Какой текущий состав экипажа? (число): ")
    var crewNumber: Int = readln().toInt()
    print("Каково количество ящиков с провизией на борту? (число): ")
    var provisionBoxes: Int = readln().toInt()
    print("Благоприятны ли метеоусловия? (да/нет): ")
    var isMeteoGood: Boolean = readln() == "да"

    var canShipTravel: Boolean = (!isHullBreached &&
                                 (crewNumber >= MIN_CREW && crewNumber <= RECOMENDED_CREW) &&
                                 provisionBoxes > OPTIMAL_PROVISION_BOXES) ||
                                 (crewNumber == RECOMENDED_CREW &&
                                         isMeteoGood &&
                                         provisionBoxes >= OPTIMAL_PROVISION_BOXES)

    println("Может ли корабль отправиться в плавание? $canShipTravel")
}