package com.example.kotlin.katas.consecutivestring

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/kotlin
 */
class SplitIntoStringPair {

    /**
     * Splits given string into pairs. If original string has odd length, it should be completed with _ character
     *
     * @param str string
     * @return string array of pairs
     */
    fun split(str: String): Array<String?> {
        var aux = str
        if (str != null && str.length > 0) {
            if (str.length % 2 != 0) {
                aux += "_"
            }

            val result = arrayOfNulls<String>(aux.length / 2)
            for (i in result.indices) {
                result[i] = aux.substring(i * 2, i * 2 + 2)
            }
            return result
        }

        return arrayOf()
    }
}
