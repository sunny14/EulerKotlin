package com.sunny.euler._1_to_10

/**
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

fun main() {
    print(euler1(1000))
}

fun euler1 (limit: Int) : Int  {

    var sum = 0;
    for (i in 1..limit-1)  {
        if (i % 3 == 0 || i % 5 == 0)   {
            sum += i;
        }
    }

    return sum;
}




