package com.sunny.euler._1_to_10

import com.sunny.euler.isPrime

/*
10001st prime
Problem 7

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

 */


fun main() {
    println(euler7())
}

fun euler7() :Long   {
    return getPrimeByIndex(10001)
}

fun getPrimeByIndex(index: Int):Long   {
    var primesCount = 0
    var num = 2L
    while (primesCount < index) {
        if ( isPrime(num) ) {
            primesCount ++
        }
        if (primesCount < index) {
            num++
        }
    }

    return num
}