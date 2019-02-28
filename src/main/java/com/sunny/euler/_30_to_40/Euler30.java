package com.sunny.euler._30_to_40;


/**
 *Digit fifth powers
 * Problem 30
 *
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 *
 *     1634 = 1^4 + 6^4 + 3^4 + 4^4
 *     8208 = 8^4 + 2^4 + 0^4 + 8^4
 *     9474 = 9^4 + 4^4 + 7^4 + 4^4
 *
 * As 1 = 14 is not a sum it is not included.
 *
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */
public class Euler30 {

    public static void main( String [] args )   {
            int sum = euler30(5);
            System.out.println ("sum is : "+sum);
    }

    static int euler30(int power)    {

        int sum = 0;
        int count = 300000;

        for (int i = 0; i < count; i++)   {
            if (i > 1 && isEqualsPowerOfDigits(i, power))    {
                sum += i;
            }
        }

        return sum;
    }

    static int getPowerOfDigits(int num, int power)   {
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i=0; i< numStr.length(); i++)  {
           sum += Math.pow(numStr.charAt(i)-48, power);
        }

        return sum;
    }

    private static boolean isEqualsPowerOfDigits(int num, int power)  {

        int sum = getPowerOfDigits(num, power);
        return (sum == num);
    }
}
