package com.sunny.euler._30_to_40;

import com.sunny.euler.Utils;

import java.util.Arrays;

/**
 * Pandigital multiples
 * Problem 38
 *
 * Take the number 192 and multiply it by each of 1, 2, and 3:
 *
 *     192 × 1 = 192
 *     192 × 2 = 384
 *     192 × 3 = 576
 *
 * By concatenating each product we get the 1 to 9 pandigital, 192384576.
 * We will call 192384576 the concatenated product of 192 and (1,2,3)
 *
 * The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,
 * giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
 *
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed
 * as the concatenated product of an integer with (1,2, ... , n) where n > 1?
 */
public class Euler38 {

    /*
    the largest concatenated product should start with 9
    the integer should contain only different symbols
    start checking from 98
    the concat length should be up to 9 digits
     */

    public static void main( String [] args )   {

       int result = -1;

        int [] array = {1,2,3,4,5};
        while (array.length>1) {
            for (int i = 9876; i > 8; i--) {
                String concat = getConcatProduct(i, array);
                if (concat.length() == 9 && Utils.isPandigital(concat, 9)) {
                    int concatNum = Integer.parseInt(concat);
                    if (result < concatNum) {
                        result = concatNum;
                    }
                    System.out.println(concat);
                }
            }

            array = Arrays.copyOfRange(array, 0, array.length-1);
        }

        System.out.println("result: "+result);

    }

    static String getConcatProduct(int base, int [] multiplyers) {
        StringBuilder sb = new StringBuilder();
        for (int multiplyer: multiplyers)   {
            sb.append(base*multiplyer);
        }

        return sb.toString();
    }

}
