package com.example.kotlin.katas.creditcardmask

import com.example.kotlin.katas.consecutivestring.CreditCardMask
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [CreditCardMask]
 */
class CreditCardMaskTest {
    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    fun parameterizedBasicTestCases(value: String, expected: String) {
        Assertions.assertEquals(expected, testClass.maskify(value))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val testClass = CreditCardMask()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments("", ""),
                Arguments.arguments("abc", "abc"),
                Arguments.arguments("abcd", "abcd"),
                Arguments.arguments("4556364607935616", "############5616"),
                Arguments.arguments("64607935616", "#######5616"),
                Arguments.arguments("Skippy", "##ippy"),
                Arguments.arguments("Nananananananananananananananana Batman!", "####################################man!"
                )
            )
        }
    }
}
