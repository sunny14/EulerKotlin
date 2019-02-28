package com.sunny.euler._1_to_10

import com.sunny.euler._1_to_10.*
import org.junit.Test
import kotlin.test.assertEquals

class Euler_1_to_10_Test {

    @Test
    fun euler1Test() {
        assertEquals(23, euler1(10))
    }

    @Test
    fun euler2Test() {
        assertEquals(10, euler2(10))
    }

    @Test
    fun euler3Test() {
        assertEquals(29, euler3(13195, 100))
    }

    @Test
    fun euler4CalculateStartTest() {
        assertEquals(999, calculateStart(2))
    }

    @Test
    fun euler4Test() {
        assertEquals(9009, euler4(2))
    }


    @Test
    fun euler5Test() {
        assertEquals(2520, euler5(10))
    }


    @Test
    fun euler6getSumOfSquaresTest() {
        assertEquals(385, getSumOfSquares(10))
    }

    @Test
    fun euler6getSquareOfSumsTest() {
        assertEquals(3025, getSquareOfSums(10))
    }

    @Test
    fun euler7getPrimeByIndexTest() {
        assertEquals(13, getPrimeByIndex(6))
    }

    @Test
    fun euler8Test()    {
        assertEquals(5832, Euler8().euler8(4))
    }

}