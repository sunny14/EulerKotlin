package com.sunny.euler;

/**
 * Truncatable primes
 * Problem 37
 *
 * The number 3797 has an interesting property. Being prime itself, it is possible
 * to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7.
 * Similarly we can work from right to left: 3797, 379, 37, and 3.
 *
 * Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
 *
 * NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */
enum DIRECTION { L2R, R2L}

public class Euler37 {

    public static void main( String [] args )   {
        int sum = 0;
        int truncatablePrimesCount = 0;
        for (int i = 100; truncatablePrimesCount < 11; i++) {
            if (isTrancatablePrimeR2L(i) && isTrancatablePrimeL2R(i))   {
                truncatablePrimesCount++;
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("result: "+sum);
    }


    static boolean isTrancatablePrimeL2R(int num) {
        return isTrancatablePrime(num, DIRECTION.L2R);
    }

    static boolean isTrancatablePrimeR2L(int num) {
        return isTrancatablePrime(num, DIRECTION.R2L);
    }

    static boolean isTrancatablePrime(int num, DIRECTION direction) {

        //will not happen
      /*  if (num < 8)    {
            return Utils.isPrime(num);
        }*/

        if ( !Utils.isPrime(num) )  {
            return false;
        }

        if (num == 0)   {
            return true;
        }

        switch (direction)  {
            case L2R:
                num = num % (int)Math.pow(10, Math.log10(num));
                break;
            case R2L:
                num = num/10;
                break;
            default:
                break;
        }

        return isTrancatablePrime(num, direction);


    }
}





