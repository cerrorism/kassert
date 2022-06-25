@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

import com.cerrorism.kassert.basic.assertTrue

infix fun <T : Comparable<T>> T.`should be greater than`(expected: T) {
    assertTrue(this > expected, "Expected $this to be greater than $expected")
}

infix fun <T : Comparable<T>> T.`should not be greater than`(expected: T) {
    assertTrue(this <= expected, "Expected $this to not be greater than $expected")
}

infix fun <T : Comparable<T>> T.`should be less than`(expected: T) {
    assertTrue(this < expected, "Expected $this to be less than $expected")
}

infix fun <T : Comparable<T>> T.`should not be less than`(expected: T) {
    assertTrue(this >= expected, "Expected $this to not be less than $expected")
}

infix fun <T : Comparable<T>> T.`should be greater than or equal to`(expected: T) {
    assertTrue(this >= expected, "Expected $this to be greater than or equal to $expected")
}

infix fun <T : Comparable<T>> T.`should not be greater than or equal to`(expected: T) {
    assertTrue(this < expected, "Expected $this to not be greater than or equal to $expected")
}

infix fun <T : Comparable<T>> T.`should be less than or equal to`(expected: T) {
    assertTrue(this <= expected, "Expected $this to be less than or equal to $expected")
}

infix fun <T : Comparable<T>> T.`should not be less than or equal to`(expected: T) {
    assertTrue(this > expected, "Expected $this to not be less than or equal to $expected")
}