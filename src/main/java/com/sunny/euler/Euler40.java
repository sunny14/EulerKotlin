package com.sunny.euler;


import java.math.BigInteger;

/**
 * Champernowne's constant
 * Problem 40
 *
 * An irrational decimal fraction is created by concatenating the positive integers:
 *
 * 0.12345678910(1)112131415161718192021...
 *
 * It can be seen that the 12th digit of the fractional part is 1.
 *
 * If dn represents the n-th digit of the fractional part, find the value of the following expression.
 *
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 */
public class Euler40 {

    public static void main( String [] args )   {

        //get following digits of the irrational decimal fraction: 1-st, 10-th, 100, 1000, 10000, 100000, 1000000
        //the fraction goes like this:
        //0...9 10 11 12 13 14 .. 19 20.. 29 30 ... 39...90 ... 99 100 101 .. 109 and so on
        //the starting zero is not counted

        StringBuilder sb = new StringBuilder();
        BigInteger multiply = BigInteger.ONE;
        int nextIndex = 1;

        for (int i = 1; i<=1000000; i++ )   {
            sb.append(i);
            if (sb.length() >= nextIndex && sb.length() % nextIndex < 10)  {
                int digit = sb.charAt(nextIndex-1)-48;
                multiply = multiply.multiply(BigInteger.valueOf(digit));
                nextIndex *= 10;
            }
        }

        System.out.println(multiply.toString());


    }


}
