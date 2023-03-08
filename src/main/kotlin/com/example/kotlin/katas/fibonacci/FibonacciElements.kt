package com.example.kotlin.katas.fibonacci

/**
 * Based on Code-wars kata:
 * https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1
 */
class FibonacciElements {

    /**
     * Returns first K fibonacci elements
     * @param k int
     * @return int[]
     */
    fun getElements(k: Int): IntArray? {
        if (k < 1 || k > 84) {
            return intArrayOf()
        }
        val result = IntArray(k)
        for (i in 0 until k) {
            if (i < 2) {
                result[i] = 1
            } else {
                result[i] = result[i - 1] + result[i - 2]
            }
        }
        return result
    }
}
