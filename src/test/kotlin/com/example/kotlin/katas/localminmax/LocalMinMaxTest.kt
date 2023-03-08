package com.example.kotlin.katas.localminmax

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * Unit test for [LocalMinMax]
 */
class LocalMinMaxTest {

    @ParameterizedTest(name = "value: {0} - expected: {1}")
    @MethodSource("basicTestCases")
    open fun parameterizedBasicTestCases(list: IntArray?, minMaxList: Array<IntArray?>?) {
        assertArrayEquals(minMaxList, localMinMax.getLocalMinMax(list))
        assertArrayEquals(minMaxList, localMinMax.getLocalMinMaxAlternative(list))
    }

    /**
     * Generates basic tests cases values
     *
     * @return [Stream<[Arguments]>]
     */
    companion object {
        private val localMinMax = LocalMinMax()

        @JvmStatic
        fun basicTestCases(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(intArrayOf(), arrayOf(intArrayOf(0), intArrayOf(0))),
                Arguments.arguments(null, arrayOf(intArrayOf(0), intArrayOf(0))),
                Arguments.arguments(intArrayOf(1), arrayOf(intArrayOf(1), intArrayOf(1))),
                Arguments.arguments(intArrayOf(1, 1), arrayOf(intArrayOf(1), intArrayOf(1))),
                Arguments.arguments(intArrayOf(1, 2, 3, 4), arrayOf(intArrayOf(1), intArrayOf(4))),
                Arguments.arguments(intArrayOf(4, 3, 2, 1), arrayOf(intArrayOf(1), intArrayOf(4)))
            )
        }
    }
}
