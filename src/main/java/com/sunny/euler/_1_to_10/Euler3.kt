package com.sunny.euler._1_to_10

import com.sunny.euler.getFactors
import com.sunny.euler.isPrimeLong

/*
Largest prime factor
Problem 3

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

fun main() {
    val max = euler3(600851475143, 10000)
    print("max is $max")
}



fun euler3(num: Long, acceptableDivider: Int): Long   {
    val set = getFactors(num, acceptableDivider)
    var max = 0L;
    for (i in set)    {

        if (i> max && isPrimeLong(i))   {
            max = i
            println(max)
        }
    }

    return max
}



