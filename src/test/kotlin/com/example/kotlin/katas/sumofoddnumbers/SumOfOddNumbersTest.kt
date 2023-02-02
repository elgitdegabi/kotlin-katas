package com.example.kotlin.katas.sumofoddnumbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [SumOfOddNumbers]
 */
class SumOfOddNumbersTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: Int, expected: Int) {
        Assertions.assertEquals(expected, testClass.sumOfOddNumbers(value))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val testClass = SumOfOddNumbers()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(0, 0),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 8),
                Arguments.arguments(3, 27),
                Arguments.arguments(4, 64),
                Arguments.arguments(5, 125),
            )
        }
    }
}
