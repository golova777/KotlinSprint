package org.example.lesson3

fun main() {

    var userName = "Татьяна"
    var userMiddleName = "Сергеевна"
    var userLastName = "Андреева"

    var userAge = 20
    println("$userLastName $userName $userMiddleName, $userAge")

    userLastName = "Сидорова"
    userAge = 22
    println("$userLastName $userName $userMiddleName, $userAge")
}