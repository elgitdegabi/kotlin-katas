package com.example.kotlin.katas.evenorodd

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/kotlin
 */
class EvenOrOdd {

    /**
     * Returns if given number is even or odd
     */
    fun evenOrOdd(number: Int): String {
        return if (number % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }
}
