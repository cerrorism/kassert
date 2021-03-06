@file:Suppress("FunctionName")

package com.cerrorism.kassert.basic

import com.cerrorism.kassert.util.failureDescription

fun <T> T.`should be null`() = apply {
    assertTrue(this == null, failureDescription("Value should be null", null, this))
}

fun <T> T.`should not be null`() = apply {
    assertFalse(this == null, "Value should not be null")
}
