package com.example.kotlin.katas.fibonacci

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.math.BigDecimal
import java.util.stream.Stream

/**
 * Unit test for [FibonacciNumber]
 */
class FibonacciNumberTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: Int, expected: BigDecimal) {
        Assertions.assertEquals(expected, fibonacciNumber.calculate(value))
    }

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("complexTestCases")
    fun parameterizedComplexTestCases(value: Int, expected: BigDecimal) {
        Assertions.assertEquals(expected, fibonacciNumber.calculate(value, HashMap()))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val fibonacciNumber = FibonacciNumber()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(0, BigDecimal.ZERO),
                Arguments.arguments(1, BigDecimal.ONE),
                Arguments.arguments(2, BigDecimal.ONE),
                Arguments.arguments(5, BigDecimal.valueOf(5)),
                Arguments.arguments(7, BigDecimal.valueOf(13)),
                Arguments.arguments(9, BigDecimal.valueOf(34)),
                Arguments.arguments(45, BigDecimal.valueOf(1134903170))
            )
        }

        @JvmStatic
        fun complexTestCases(): Stream<Arguments> {
            val complexCases: Stream<Arguments> = Stream.of(
                Arguments.arguments(85, BigDecimal("259695496911122585")),
                Arguments.arguments(99, BigDecimal("218922995834555169026"))
            )

            return Stream.concat(basicTestCases(), complexCases)
        }
    }
}
