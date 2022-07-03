@file:Suppress("FunctionName")

package com.cerrorism.kassert.basic

import com.cerrorism.kassert.util.failureDescription

infix fun <T> T.`should be`(expected: T?) = apply {
    assertTrue(this === expected, failureDescription("References should be the same", expected, this))
}

infix fun <T> T.`should not be`(expected: T?) = apply {
    assertFalse(this === expected, failureDescription("References should not be the same", expected, this))
}
