@file:Suppress("FunctionName")
package com.cerror.test.basic

import com.cerror.test.util.failureDescription

infix fun <T> T.`should be`(expected: T?) {
    assertTrue(this === expected, failureDescription("References should be the same", expected, this))
}

infix fun <T> T.`should not be`(expected: T?) {
    assertFalse(this === expected, failureDescription("References should not be the same", expected, this))
}
