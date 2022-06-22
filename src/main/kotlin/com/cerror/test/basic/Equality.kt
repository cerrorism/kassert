@file:Suppress("FunctionName")
package com.cerror.test.basic

import com.cerror.test.util.failureDescription

infix fun <T> T.`should be equal to`(expected: T?) {
    assertTrue(this == expected, failureDescription("Values should be equal", expected, this))
}

infix fun <T> T.`should not be equal to`(expected: T?) {
    assertFalse(this == expected, failureDescription("Values should not be equal", expected, this))
}