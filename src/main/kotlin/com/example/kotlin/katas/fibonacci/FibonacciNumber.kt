package com.example.kotlin.katas.fibonacci

import java.math.BigDecimal

/**
 * Based on Interview challenge:
 * Calculate Nth Fibonacci number and optimize your solution to support "big numbers"
 */

class FibonacciNumber {

    private val MAX_SUPPORTED_VALUE = 99

    /**
     * Returns fibonacci Nth number
     *
     * @param k int
     * @return [BigDecimal]
     */
    fun calculate(k: Int): BigDecimal {
        if (k < 1 || k > MAX_SUPPORTED_VALUE) {
            return BigDecimal.ZERO
        }
        return if (k <= 2) {
            BigDecimal.ONE
        } else calculate(k - 1).add(calculate(k - 2))
    }

    /**
     * Returns fibonacci Nth number using memoization
     *
     * @param k int
     * @return [BigDecimal]
     */
    fun calculate(k: Int, customCache: MutableMap<Int?, BigDecimal?>): BigDecimal? {
        if (k < 1 || k > MAX_SUPPORTED_VALUE) {
            return BigDecimal.ZERO
        }
        if (customCache.containsKey(k)) {
            return customCache[k]
        }
        if (k <= 2) {
            customCache[Integer.valueOf(k)] = BigDecimal.ONE
            return BigDecimal.ONE
        }
        val beforePrevious = calculate(k - 2, customCache)
        val previous = calculate(k - 1, customCache)
        val current = beforePrevious!!.add(previous)
        customCache[Integer.valueOf(k)] = current
        return current
    }
}
