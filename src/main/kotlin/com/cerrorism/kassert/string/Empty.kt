@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue

fun CharSequence.`should be empty`(): CharSequence {
    assertTrue(this.isEmpty(), "Expected to be empty. Actual: $this")
    return this
}

fun CharSequence.`should not be empty`(): CharSequence {
    assertFalse(this.isEmpty(), "Expected to not be empty.")
    return this
}

fun CharSequence?.`should be null or empty`(): CharSequence? {
    assertTrue(this.isNullOrEmpty(), "Expected to be null or empty. Actual: $this")
    return this
}

fun CharSequence?.`should not be null or empty`(): CharSequence? {
    assertFalse(this.isNullOrEmpty(), "Expected to not be null or empty.")
    return this
}

fun CharSequence.`should be blank`(): CharSequence {
    assertTrue(this.isBlank(), "Expected to be blank. Actual: $this")
    return this
}

fun CharSequence.`should not be blank`(): CharSequence {
    assertFalse(this.isBlank(), "Expected to not be blank.")
    return this
}

fun CharSequence?.`should be null or blank`(): CharSequence? {
    assertTrue(this.isNullOrBlank(), "Expected to be null or blank. Actual: $this")
    return this
}

fun CharSequence?.`should not be null or blank`(): CharSequence? {
    assertFalse(this.isNullOrBlank(), "Expected to not be null or blank.")
    return this
}
