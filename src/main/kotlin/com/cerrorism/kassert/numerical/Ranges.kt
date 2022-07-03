@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

import com.cerrorism.kassert.basic.assertTrue

infix fun <T : Comparable<T>> T.`should be in range`(range: ClosedRange<T>) = apply {
    assertTrue(
        this in range,
        "Expected $this to be between (and including) ${range.start} and $${range.endInclusive}"
    )
}

fun <T : Comparable<T>> T.`should be in range`(lowerBound: T, upperBound: T) = apply {
    this `should be in range` lowerBound..upperBound
}

infix fun <T : Comparable<T>> T.`should not be in range`(range: ClosedRange<T>) = apply {
    assertTrue(
        this !in range,
        "Expected $this to not be between (and including) ${range.start} and ${range.endInclusive}"
    )
}

fun <T : Comparable<T>> T.`should not be in range`(lowerBound: T, upperBound: T) = apply {
    this `should not be in range` lowerBound..upperBound
}
