@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue

fun CharSequence.`should be empty`() = apply {
    assertTrue(this.isEmpty(), "Expected to be empty. Actual: $this")
}

fun CharSequence.`should not be empty`() = apply {
    assertFalse(this.isEmpty(), "Expected to not be empty.")
}

fun CharSequence?.`should be null or empty`() = apply {
    assertTrue(this.isNullOrEmpty(), "Expected to be null or empty. Actual: $this")
}

fun CharSequence?.`should not be null or empty`() = apply {
    assertFalse(this.isNullOrEmpty(), "Expected to not be null or empty.")
}

fun CharSequence.`should be blank`() = apply {
    assertTrue(this.isBlank(), "Expected to be blank. Actual: $this")
}

fun CharSequence.`should not be blank`() = apply {
    assertFalse(this.isBlank(), "Expected to not be blank.")
}

fun CharSequence?.`should be null or blank`() = apply {
    assertTrue(this.isNullOrBlank(), "Expected to be null or blank. Actual: $this")
}

fun CharSequence?.`should not be null or blank`() = apply {
    assertFalse(this.isNullOrBlank(), "Expected to not be null or blank.")
}
