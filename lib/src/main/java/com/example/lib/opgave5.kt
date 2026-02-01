package com.example.lib

fun main() {
    printFizzOrBuzz()
}

fun printFizzOrBuzz() {
    val listOfNumbers: List<Int> =  (1..100).toList()

    listOfNumbers.forEach { number ->
        if (number % 3 == 0 && number % 5 == 0) {
            println("FizzBuzz")
        } else if (number % 3 == 0) {
            println("Fizz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else {
            println(number)
        }
    }
}