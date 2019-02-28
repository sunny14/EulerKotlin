package com.sunny.euler._1_to_10

/*
Sum square difference
Problem 6

The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers
and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers
and the square of the sum.

 */

fun main() {
    val limit = 100
    println(getSquareOfSums(limit) - getSumOfSquares(limit))
}

fun getSumOfSquares (limit: Int): Int  {
    var sum = 0;
    for (i in 1..limit) {
        sum += Math.pow(i.toDouble(), 2.toDouble()).toInt()
    }

    return sum;
}


fun getSquareOfSums (limit: Int): Int  {
    var sum = 0;
    for (i in 1..limit) {
        sum += i
    }

    return Math.pow(sum.toDouble(), 2.toDouble()).toInt()
}

