@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

import com.cerrorism.kassert.basic.assertTrue

infix fun <T : Comparable<T>> T.`should be in range`(range: ClosedRange<T>): T {
    assertTrue(
        this in range,
        "Expected $this to be between (and including) ${range.start} and $${range.endInclusive}"
    )
    return this
}

fun <T : Comparable<T>> T.`should be in range`(lowerBound: T, upperBound: T): T {
    return this `should be in range` lowerBound..upperBound
}

infix fun <T : Comparable<T>> T.`should not be in range`(range: ClosedRange<T>): T {
    assertTrue(
        this !in range,
        "Expected $this to not be between (and including) ${range.start} and ${range.endInclusive}"
    )
    return this
}

fun <T : Comparable<T>> T.`should not be in range`(lowerBound: T, upperBound: T): T {
    return this `should not be in range` lowerBound..upperBound
}
