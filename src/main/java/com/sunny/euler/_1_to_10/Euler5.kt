package com.sunny.euler._1_to_10

/*
Smallest multiple
Problem 5

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */


fun main() {
    println(euler5(20))
}


fun euler5(limit: Int):Int  {

    var num = limit
    var isFound = false

    while ( !isFound ) {
        if (isDividableByRange(limit, num))   {
            isFound = true
            num--
        }

        num ++
    }

    return num
}

private fun isDividableByRange(limit: Int, num: Int): Boolean {
    for (i in 2..limit) {
        if (num % i != 0) {
            return false
        }
    }

    return true
}