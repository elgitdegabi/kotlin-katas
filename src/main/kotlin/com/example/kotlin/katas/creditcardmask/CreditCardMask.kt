package com.example.kotlin.katas.consecutivestring

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/5412509bd436bd33920011bc/train/kotlin
 */
class CreditCardMask {

    /**
     * Generates a mask for given str except last 4 characters
     *
     * @param str string
     * @return string with masked values
     */
    fun maskify(str: String): String {
        if (str != null && str.length > 4) {
            var mask = ""
            for (i in 0 until str.length - 4) {
                mask += "#"
            }
            return mask + str.substring(str.length - 4)
        }
        return str
    }
}
