package com.example.kotlin.katas.twooldestage

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [TwoOldestAge]
 */
class TwoOldestAgeTest {
    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: List<Int>, expected: IntArray) {
        Assertions.assertArrayEquals(expected, testClass.twoOldestAges(value).toIntArray())
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val testClass = TwoOldestAge()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(listOf<Int>(), intArrayOf()),
                Arguments.arguments(listOf(1), intArrayOf()),
                Arguments.arguments(listOf(0, 0), intArrayOf(0, 0)),
                Arguments.arguments(listOf(5, 10), intArrayOf(5, 10)),
                Arguments.arguments(listOf(1, 3, 10, 0), intArrayOf(3, 10)),
                Arguments.arguments(listOf(1, 2, 10, 8), intArrayOf(8, 10)),
                Arguments.arguments(listOf(1, 5, 87, 45, 8, 8), intArrayOf(45, 87)),
                Arguments.arguments(listOf(2, 5, 87, 45, 8, 8), intArrayOf(45, 87)),
                Arguments.arguments(listOf(6, 5, 83, 5, 3, 18), intArrayOf(18, 83)),
                Arguments.arguments(listOf(6, 5, 83, 5, 3, 18), intArrayOf(18, 83))
            )
        }
    }
}
