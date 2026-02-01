package com.example.lib

import java.util.Scanner

// Opgave 1

fun main() {

    try {
        val reader = Scanner(System. `in`)
        print("Please enter your age")

        val number = reader.nextInt()
        print("You entered: $number")

        if (number >= 18) {
            print(" You are eligible to vote")
        } else print(" You are not eligible to vote")
    } catch (e: Exception) {

    }

}