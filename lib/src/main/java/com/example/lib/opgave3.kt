package com.example.lib

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 10)

    getAverageOfList(list)


}

fun getAverageOfList(list: List<Int>): Int {

    var sum = 0

    list.forEach { number ->
        sum += number
    }

    val average = sum / list.size
    println(average)
    return average
}

