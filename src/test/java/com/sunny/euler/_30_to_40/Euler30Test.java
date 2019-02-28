package com.sunny.euler._30_to_40;

import com.sunny.euler._30_to_40.Euler30;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Euler30Test {

    /**
     *  *     1634 = 1^4 + 6^4 + 3^4 + 4^4
     *  *     8208 = 8^4 + 2^4 + 0^4 + 8^4
     *  *     9474 = 9^4 + 4^4 + 7^4 + 4^4
     */


    @Test
    public void fourthPowerTest()   {

        int sum = Euler30.euler30(4);
        assertEquals((1634+8208+9474), sum);

    }

    @Test
    public void fourthPowerTest2()   {

        int num = 1634;
        int powerOfDigits = Euler30.getPowerOfDigits(num, 4);
        assertEquals(num, powerOfDigits);

    }
}
