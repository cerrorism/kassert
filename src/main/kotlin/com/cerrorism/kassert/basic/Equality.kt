@file:Suppress("FunctionName")

package com.cerrorism.kassert.basic

import com.cerrorism.kassert.util.failureDescription

infix fun <T> T.`should be equal to`(expected: T?) = apply {
    assertTrue(this == expected, failureDescription("Values should be equal", expected, this))
}

infix fun <T> T.`should not be equal to`(expected: T?) = apply {
    assertFalse(this == expected, failureDescription("Values should not be equal", expected, this))
}
