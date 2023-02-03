package com.example.kotlin.katas.consecutivestring

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/56a5d994ac971f1ac500003e/kotlin
 */
class ConsecutiveString {

    /**
     * @param strarr array of strings
     * @param k      minimum length to consider a string as a candidate and also quantity of strings to concatenate
     * @return concatenated k strings of length k or grater
     */
    fun consecutiveString(strarr: Array<String>, k: Int): String {
        var result = ""
        if (strarr.size > 0 && k > 0 && k < strarr.size) {
            for (i in 0 until strarr.size - k + 1) {
                var current = ""
                for (j in i until i + k) {
                    current += strarr[j]
                }
                if (current.length > result.length) {
                    result = current
                }
            }
        }

        return result
    }
}
