package com.example.kotlin.katas.fibonacci

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [FibonacciElements]
 */
class FibonacciElementsTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: Int, expected: IntArray) {
        Assertions.assertArrayEquals(expected, fibonacciElements.getElements(value))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val fibonacciElements = FibonacciElements()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(0, intArrayOf()),
                Arguments.arguments(1, intArrayOf(1)),
                Arguments.arguments(2, intArrayOf(1, 1)),
                Arguments.arguments(85, intArrayOf()),
                Arguments.arguments(5, intArrayOf(1, 1, 2, 3, 5)),
                Arguments.arguments(7, intArrayOf(1, 1, 2, 3, 5, 8, 13)),
                Arguments.arguments(9, intArrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34))
            )
        }
    }
}
