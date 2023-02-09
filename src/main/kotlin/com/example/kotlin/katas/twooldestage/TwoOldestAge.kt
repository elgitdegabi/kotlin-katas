package com.example.kotlin.katas.twooldestage

/**
 * Based on Code-wars kata:
 * https://www.codewars.com/kata/511f11d355fe575d2c000001/kotlin
 */
class TwoOldestAge {
    /**
     * Gets two oldest ages from given array of ages
     *
     * @param ages int array of ages
     * @return int array with two oldest ages
     */
    fun twoOldestAges(ages: List<Int>): List<Int> {
        if (ages == null || ages.size < 2) {
            return listOf()
        }
        return ages.sorted().takeLast(2)

        /* old fashion solution
        val oldest = mutableListOf(0, 0)
        for (i in ages.indices) {
            if (ages[i] > 0) {
                for (j in oldest.indices.reversed()) {
                    if (ages[i] > oldest[j]) {
                        if (j > 0) {
                            oldest[j - 1] = oldest[j]
                        }
                        oldest[j] = ages[i]
                        break
                    }
                }
            }
        }
        return oldest */
    }
}
