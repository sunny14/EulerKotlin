package com.sunny.euler;

import java.util.HashSet;
import java.util.Set;

public class Utils {


    public static boolean isPrimeOld(int num)   {
        for (int i=2; i <= (num+1)/2; i++)   {

            if (i>3 && i % 3 == 0)  {
                continue;
            }
            if (i>5 && i % 5 == 0)  {
                continue;
            }

            if (i>2 && i % 2 == 0)  {
                continue;
            }

            if ( num % i == 0 ) {
                return false;
            }
        }

        return true;
    }

    //TODO: fix
    public static boolean isPandigital(String numStr, int limit)    {
        if (numStr.length() != limit)   {
            System.out.println("numStr.length()="+numStr.length());
            return false;
        }

        int [] array = {};//IntStream.rangeClosed(1, limit).toArray();
        Set<Integer> set = new HashSet<Integer>(array.length);
        for (int num: array)    {
            set.add(num);
        }


        for (int i=0; i<numStr.length(); i++)   {
            int symbol = numStr.charAt(i)-48;
            if (set.contains(symbol))  {
                set.remove(symbol);
            }
            else{
                return false;
            }
        }

        return set.isEmpty();
    }
}
