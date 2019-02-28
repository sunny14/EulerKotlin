package com.sunny.euler;


/**
 * Pandigital prime
 * Problem 41
 *
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
 * For example, 2143 is a 4-digit pandigital and is also prime.
 *
 * What is the largest n-digit pandigital prime that exists?
 */
public class Euler41 {

    //the largest pandigital has 9 digits
    //lets check all padigitals for being prime and lets start from the end
    //stop when the first pandigital prime is found

    public static void main( String [] args )   {

        for (int i=987654321; i>=123456789; i -=2)    {
            if (i % 1000000 == 1) {
                System.out.println("processing "+i);
             ////   continue;
            }
            if (Utils.isPandigital(String.valueOf(i), 9) && Utils.isPrime(i))   {
                System.out.println(i);
                break;
            }
        }
    }

}
