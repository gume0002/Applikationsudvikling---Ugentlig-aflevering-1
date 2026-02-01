package com.example.lib

fun main() {

    print("Please enter your name: ")
    val nameInput = readln()

    nameFormatter(nameInput)
}

fun nameFormatter(name: String): String {

    val fullName = name

    val partsOfName = fullName.split(" ")
    val firstNames = partsOfName.dropLast(1)
    val lastName = partsOfName.last()

    for (name in firstNames) {
        print(name[0])
        print(".")
    }
    print(" ")
    println(lastName)

    return name
}