package org.example.lesson2

fun main() {

    val numberStaffEmployees = 50
    val staffEmployeeSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000

    val staffEmployeeTotalSalary = numberStaffEmployees * staffEmployeeSalary
    val totalSalary = staffEmployeeTotalSalary + (numberOfInterns * internSalary)
    val averageSalary = totalSalary / (numberStaffEmployees + numberOfInterns)

    println(staffEmployeeTotalSalary)
    println(totalSalary)
    println(averageSalary)
}