package com.sunny.euler

import org.junit.Test
import java.util.*
import kotlin.system.measureTimeMillis
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class UtilsTest {

    @Test
    fun getFactorsTest() {
        val expectedSet = LinkedHashSet(Arrays.asList(5L, 7L, 13L, 29L, 35L, 65L, 91L, 145L, 203L, 377L, 455L, 1015L, 1885L, 2639L))
        assertEquals(expectedSet, getFactors(13195, 100))
    }


    @Test
    fun isPrimeTest() {
        assertTrue(isPrime(11))
        assertFalse(isPrime(12))
    }


    @Test
    fun isPalindromeTest() {
        assertTrue(isPalindrome(9119))
        assertFalse(isPalindrome(956459))
    }


    @Test
    fun isPrimeBenchmarkTest()   {
        val numInt = 1249873
        val numLong = 1249873L

        val limit = 1000
        val intTime = measureTimeMillis { for (i in 1..limit) isPrime(numInt) }
        val longTime = measureTimeMillis { for (i in 1..limit) isPrimeLong(numLong) }

        println("intTime is $intTime, longTime is $longTime")

        assertTrue(intTime < longTime/2)

    }
}
