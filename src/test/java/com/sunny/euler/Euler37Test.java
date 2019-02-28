package com.sunny.euler;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class Euler37Test {

    @Test
    public void isTrancatablePrimeTest()    {
        assertTrue(Euler37.isTrancatablePrimeL2R(3797));
        assertTrue(Euler37.isTrancatablePrimeR2L(3797));
        assertFalse(Euler37.isTrancatablePrimeL2R(3798));
    }
}
