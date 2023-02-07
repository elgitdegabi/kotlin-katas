package com.example.kotlin.katas.splitstringintopair

import com.example.kotlin.katas.consecutivestring.SplitIntoStringPair
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test cases for [SplitIntoStringPair]
 */
class SplitIntoStringPairTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: String, expected: Array<String?>) {
        assertArrayEquals(expected, testClass.split(value))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [&lt; Arguments &gt;][Stream]
     */
    companion object {
        private val testClass = SplitIntoStringPair()

        @JvmStatic
        private fun basicTestCases(): Stream<Arguments?>? {
            return Stream.of(
                Arguments.arguments("", arrayOf<String>()),
                Arguments.arguments("a", arrayOf("a_")),
                Arguments.arguments("ab", arrayOf("ab")),
                Arguments.arguments("abc", arrayOf("ab", "c_")),
                Arguments.arguments("abcd", arrayOf("ab", "cd"))
            )
        }
    }
}
