package com.sunny.euler

fun getFactors(num: Long, acceptableDivider: Int=2): LinkedHashSet<Long> {
    var resultSet = LinkedHashSet<Long>()

    for ( i in 2..(num+1)/acceptableDivider )   {

        if (resultSet.contains(i))  {
            continue
        }

        if ( num % i == 0L ) {
            resultSet.add(i)
            val complementFactor = num/i
            resultSet.add(complementFactor)
            println("adding $i and $complementFactor")
        }
    }

    println("got ${resultSet.size} factors!")
    return resultSet
}


fun isPrime(num: Int): Boolean  {
    if ( num > 2 && num % 2 == 0 ) {
        return false;
    }


    for (i in 3..num-1 step 2)    {
        if (num % i == 0)   {
            return false
        }
    }

    return true
}

fun isPrimeLong(num: Long): Boolean  {
    if ( num > 2 && num % 2 == 0L ) {
        return false;
    }


    for (i in 3..num-1 step 2)    {
        if (num % i == 0L)   {
            return false
        }
    }

    return true
}


fun isPalindrome(num: Int): Boolean {
    val numStr = num.toString();
    for ( shift in 0..(numStr.length+1)/2 ) {
        if ( numStr.get(shift) != numStr.get(numStr.length-shift-1) ) {
            return false
        }
    }

    return true
}