package com.sunny.euler._1_to_10


/*
Largest product in a series
Problem 8

The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
Find the thirteen adjacent digits in the 1000-digit number that have the greatest product.
What is the value of this product?

 */

class Euler8 {



    fun getFileAsString(fileName: String): String {

        return Euler8::class.java.getClassLoader().getResource(fileName).readText()
    }

    fun euler8(adjacentDigitsNum: Int): Long {
        var text = getFileAsString("euler8")
        //remove all non-alphabetic symbols
        text = text.split("\n").joinToString ("")
        assert(text.length == 1000)

        return getGreatestProduct(text, adjacentDigitsNum)
    }

    fun getGreatestProduct(text: String, adjacentDigitsNum: Int): Long {

        var maxProduct = 0L;
        for (shift in 0..text.length - adjacentDigitsNum) {
            val piece = text.substring(shift, adjacentDigitsNum + shift)
            assert(piece.length == adjacentDigitsNum)
            val product = getProduct(piece)
            if (product > maxProduct) {
                maxProduct = product
                println("product: $product, num=$piece")
            }
        }

        return maxProduct
    }

    fun getProduct(str: String): Long {
        if (str.contains("0"))  {
            return 0;
        }

        var product = 1L
        for (i in 0..str.length - 1) {
            product = product * (str.get(i).toInt() - 48)
        }

        return product
    }

}

fun main() {
    println(Euler8().euler8(13))
}


