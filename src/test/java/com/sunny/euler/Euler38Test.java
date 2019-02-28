package com.sunny.euler;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Euler38Test {

    @Test
    public void getPandigitalTest() {
        int [] array = {1,2,3};
        assertEquals("192384576", Euler38.getConcatProduct(192, array));

        int [] array2 = {1,2,3,4,5};
        assertEquals("918273645", Euler38.getConcatProduct(9, array2));
    }

    @Test
    public void isPandigitalTest()  {
        assertTrue(Utils.isPandigital("192384576", 9));
    }
}
