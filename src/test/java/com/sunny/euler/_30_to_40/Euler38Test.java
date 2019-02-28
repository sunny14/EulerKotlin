package com.sunny.euler._30_to_40;

import com.sunny.euler.Utils;
import com.sunny.euler._30_to_40.Euler38;
import junit.framework.TestCase;
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
        TestCase.assertTrue(Utils.isPandigital("192384576", 9));
    }
}
