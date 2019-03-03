package com.sunny.euler._1_to_10

import com.sunny.euler.isPrime

/*
Summation of primes
Problem 10

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

 */


fun main() {
    println(euler10())
}

fun euler10(): Long {
    return getSumOfPrimesBelow(2_000_000)
}

fun getSumOfPrimesBelow(limit: Int): Long   {
    var sum = 0L
    for (counter in 2 until limit)  {
        if (isPrime(counter))   {
            sum += counter
            println("adding $counter")
        }
    }

    return sum
}