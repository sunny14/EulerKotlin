package com.sunny.euler._30_to_40;


import com.sunny.euler.Utils;

/**
 * Circular primes
 * Problem 35
 *
 * The number, 197, is called a circular prime because all rotations of the digits:
 * 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 */
public class Euler35 {

    public static int euler35(int counter)   {
        int circularPrimesCount = 0;
        for (int i = 2; i< counter; i++)  {
            if (isCircularPrime(i)) {
                System.out.println(i);
                circularPrimesCount++;
            }
        }

        System.out.println("circularPrimesCount: "+circularPrimesCount);
        return circularPrimesCount;
    }


    static boolean isCircularPrime(int num)    {

        if ( !Utils.isPrime(num))  {
            return false;
        }

        int numLength = (int)Math.log10(num);
        int shiftedNum = shift(num, numLength);

        do {

            if ( !Utils.isPrime(shiftedNum))    {
                return false;
            }
            if (shiftedNum != num) {
                shiftedNum = shift(shiftedNum, numLength);
            }
        }
        while (shiftedNum != num);


        return true;
    }

    private static int shift(int num, int numlength) {
       return num/10 + (num % 10)*(int)Math.pow(10, numlength);
    }

}
