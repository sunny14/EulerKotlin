package com.sunny.euler

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
}