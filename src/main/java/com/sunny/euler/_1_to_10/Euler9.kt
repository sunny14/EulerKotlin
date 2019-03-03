package com.sunny.euler._1_to_10

/*
Special Pythagorean triplet
Problem 9

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */


fun main() {
    println(euler9())
}

fun euler9() :Int   {
    val sum = 1000
    for (a in 1..sum)  {
        for (b in 1..sum)  {
            for (c in 1..sum)  {
                if ((a+b+c) == sum && isPythagoreanTriplet(a, b, c))   {
                    return a*b*c
                }
            }
        }

    }

    return -1
}


fun isPythagoreanTriplet(a: Int, b:Int, c: Int): Boolean    {
    return power2(a) + power2(b) == power2(c)
}

private fun power2(a: Int) = Math.pow(a.toDouble(), 2.toDouble())