package com.example.kotlin.katas.consecutivestring

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [ConsecutiveString]
 */
class ConsecutiveStringTest {
    @ParameterizedTest(name = "array: {0} - k: {1} - expected: {2}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(array: Array<String>, k: Int, expected: String) {
        Assertions.assertEquals(expected, testClass.consecutiveString(array, k))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val testClass = ConsecutiveString()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(arrayOf("a", "b", "cd", "efg"), 2, "cdefg"),
                Arguments.arguments(arrayOf("tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"), 2, "folingtrashy"),
                Arguments.arguments(
                    arrayOf("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"),
                    2,
                    "abigailtheta"
                ),
                Arguments.arguments(
                    arrayOf(
                        "ejjjjmmtthh",
                        "zxxuueeg",
                        "aanlljrrrxx",
                        "dqqqaaabbb",
                        "oocccffuucccjjjkkkjyyyeehh"
                    ), 1, "oocccffuucccjjjkkkjyyyeehh"
                ),
                Arguments.arguments(arrayOf<String>(), 3, ""),
                Arguments.arguments(
                    arrayOf(
                        "itvayloxrp",
                        "wkppqsztdkmvcuwvereiupccauycnjutlv",
                        "vweqilsfytihvrzlaodfixoyxvyuyvgpck"
                    ), 2, "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck"
                ),
                Arguments.arguments(
                    arrayOf("wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"),
                    2,
                    "wlwsasphmxxowiaxujylentrklctozmymu"
                ),
                Arguments.arguments(arrayOf("zone", "abigail", "theta", "form", "libe", "zas"), -2, ""),
                Arguments.arguments(
                    arrayOf("it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"),
                    3,
                    "ixoyx3452zzzzzzzzzzzz"
                ),
                Arguments.arguments(arrayOf("it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"), 15, ""),
                Arguments.arguments(arrayOf("it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"), 0, "")
            )
        }
    }
}
