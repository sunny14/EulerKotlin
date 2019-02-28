package com.sunny.euler

/*
Largest palindrome product
Problem 4

A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.


 */


fun main() {
    println(euler4(3))
}

fun euler4(numOfDigits: Int):Int    {
    var max = 0

    val start = calculateStart(numOfDigits-1)
    val finish = calculate_10_inPow(numOfDigits-1)
    for (i in start downTo finish) {
        for (j in start downTo finish) {
            val product = i*j
            if (product > max && isPalindrome(product)) {
                max = product
            }
        }
    }

    return max
}

fun calculateStart(numOfDigits: Int): Int {
    var digitsCounter = numOfDigits
    var result = 0;
    while (digitsCounter >= 0)  {
        result += 9*calculate_10_inPow(digitsCounter)
        digitsCounter = digitsCounter.dec()
    }

    return result
}

private fun calculate_10_inPow(numOfDigits: Int) = Math.pow(10.toDouble(), numOfDigits.toDouble()).toInt()