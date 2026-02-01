package com.example.lib

fun main() {

    val max: Int = getMax(1, 18, 8)
    val min: Int = getMin(1, 18, -8)

    println(max) // 18
    println(min) // -8
}

fun getMax(firstInt: Int, secondInt: Int, thirdInt: Int): Int {
    return maxOf(firstInt, secondInt, thirdInt)
}

fun getMin(firstInt: Int, secondInt: Int, thirdInt: Int): Int {
    return minOf(firstInt, secondInt, thirdInt)
}