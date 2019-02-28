package com.sunny.euler._30_to_40;

import com.sunny.euler.Utils;
import com.sunny.euler._30_to_40.Euler35;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Euler35Test {

    @Test
    public void isPrimeTest()   {
        TestCase.assertTrue(Utils.isPrime(7));
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
    @Ignore
    public void euler35millionTest()   {
        assertEquals(55, Euler35.euler35(1_000_000));
    }
}
