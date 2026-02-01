package com.example.lib

// Opgave 1

fun main() {

    println(checkCPR())

}

fun checkCPR(): Boolean {

    println("Please Enter Your CPR-Number")
    val cprNumberInput = readln() // FRA YOUTUBE
    val lengthOfCPR = cprNumberInput.length

    val firstTwoIndexes = cprNumberInput.substring(0, 2).toInt()
    val middleTwoDigits = cprNumberInput.substring(2, 4).toInt()

    if (lengthOfCPR != 10) {
        return false
    } else if (firstTwoIndexes > 31) {
       return false
    } else if (middleTwoDigits > 12) {
        return false
    } else {
        return true
    }
}