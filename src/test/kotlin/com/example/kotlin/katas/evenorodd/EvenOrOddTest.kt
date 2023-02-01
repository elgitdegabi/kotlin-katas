package com.example.kotlin.katas.evenorodd

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [EvenOrOdd]
 */
class EvenOrOddTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: Int, expected: String) {
        Assertions.assertEquals(expected, evenOrOdd.evenOrOdd(value))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val evenOrOdd = EvenOrOdd()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(0, "Even"),
                Arguments.arguments(1, "Odd"),
                Arguments.arguments(-1, "Odd"),
                Arguments.arguments(2, "Even"),
                Arguments.arguments(-2, "Even"),
            )
        }
    }
}
