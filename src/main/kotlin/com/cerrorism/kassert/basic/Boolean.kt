@file:Suppress("FunctionName")

package com.cerrorism.kassert.basic

import kotlin.test.fail

fun assertTrue(actual: Boolean, message: String? = null) {
    if (!actual) {
        fail(message)
    }
}

fun assertFalse(actual: Boolean, message: String? = null) = assertTrue(!actual, message)

fun Boolean.`should be true`(message: String? = null) {
    assertTrue(this, message ?: "Value should be true")
}

fun Boolean.`should be false`(message: String? = null) {
    assertFalse(this, message ?: "Value should be false")
}

fun Boolean.`should not be true`(message: String? = null) = this.`should be false`(message)

fun Boolean.`should not be false`(message: String? = null) = this.`should be true`(message)