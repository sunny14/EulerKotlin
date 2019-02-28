package com.sunny.euler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Euler35Test {

    @Test
    public void isPrimeTest()   {
        assertTrue(Utils.isPrime(7));
        assertFalse(Utils.isPrime(6));
    }


    @Test
    public void isCircularPrimeTest()   {
        assertTrue(Euler35.isCircularPrime(197));
        assertFalse(Euler35.isCircularPrime(196));
    }

    @Test
    public void euler35_100Test()   {
        assertEquals(13, Euler35.euler35(100));
    }

    @Test
    public void euler35millionTest()   {
        assertEquals(55, Euler35.euler35(1_000_000));
    }
}
