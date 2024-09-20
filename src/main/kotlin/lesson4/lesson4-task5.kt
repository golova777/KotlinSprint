package org.example.lesson4

fun main() {
    print("Есть наличие повреждений корпуса? (да/нет): ")
    var isHullBreached: Boolean = readln() == "да"
    print("Какой текущий состав экипажа? (число): ")
    var crewNumber: Int = readln().toInt()
    print("Каково количество ящиков с провизией на борту? (число): ")
    var provisionBoxes: Int = readln().toInt()
    print("Благоприятны ли метеоусловия? (да/нет): ")
    var isMeteoGood: Boolean = readln() == "да"

    var canShipTravel: Boolean = (!isHullBreached && (crewNumber >= 55 && crewNumber <= 70) && provisionBoxes > 50)
                                  || (crewNumber == 70 && isMeteoGood && provisionBoxes >= 50)

    println("Может ли корабль отправиться в плавание? $canShipTravel")
}