package com.sunny.euler._1_to_10

import org.junit.Test
import kotlin.test.assertEquals


class Euler_11Test   {


    @Test
    fun euler11Test()    {
        assertEquals(24_468_444, euler11(4, "euler11_small"))
    }

    @Test
    fun testHoriontal() {
        val m = Matrix(getMatrixFromFile("euler11_small", 4), 4)
        var max = 0
        for (index in m.matrix.indices) {
            for (index2 in m.matrix.get(index).indices) {
                max = m.updateHorizontalProduct(index, index2, 4, max)
            }
        }

        assertEquals(9_507_960, max)
    }

    @Test
    fun testVertical() {
        val m = Matrix(getMatrixFromFile("euler11_small", 4), 4)
        var max = 0
        for (index in m.matrix.indices) {
            for (index2 in m.matrix.get(index).indices) {
                max = m.updateVerticalProduct(index, index2, 4, max)
            }
        }

        assertEquals(6_514_520, max)
    }

    @Test
    fun testLeftDown() {
        val m = Matrix(getMatrixFromFile("euler11_small", 4), 4)
        var max = 0
        for (index in m.matrix.indices) {
            for (index2 in m.matrix.get(index).indices) {
                max = m.updateLeftDownProduct(index, index2, 4, max)
            }
        }

        assertEquals(24_468_444, max)
    }

    @Test
    fun testRightDown() {
        val m = Matrix(getMatrixFromFile("euler11_small", 4), 4)
        var max = 0
        for (index in m.matrix.indices) {
            for (index2 in m.matrix.get(index).indices) {
                max = m.updateRightDownProduct(index, index2, 4, max)
            }
        }

        assertEquals(279_496, max)
    }


}