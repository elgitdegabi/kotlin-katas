package com.example.kotlin.katas.localminmax

import java.util.*

/**
 * Based on Google interview challenge
 */
class LocalMinMax {

    /**
     * Get local min and max values from given int array
     *
     * @param list int[]
     * @return int[][] matrix with min and max
     */
    fun getLocalMinMax(list: IntArray?): Array<IntArray>? {
        val result = Array(2) { IntArray(1) }
        if (list != null && list.size > 0) {
            val min = Arrays.stream(list).mapToObj { value: Int -> value }.min(Comparator.naturalOrder()).get()
            val max = Arrays.stream(list).mapToObj { value: Int -> value }.max(Comparator.naturalOrder()).get()
            result[0][0] = min
            result[1][0] = max
        }
        return result
    }

    /**
     * Get local min and max values from given int array
     *
     * @param list int[]
     * @return int[][] matrix with min and max
     */
    fun getLocalMinMaxAlternative(list: IntArray?): Array<IntArray>? {
        val result = Array(2) { IntArray(1) }
        if (list != null && list.size > 0) {
            Arrays.sort(list)
            result[0][0] = list[0]
            result[1][0] = list[list.size - 1]
        }
        return result
    }
}
