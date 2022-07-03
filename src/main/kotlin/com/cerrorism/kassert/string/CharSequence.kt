@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue

infix fun CharSequence.`should start with`(s: CharSequence) = apply {
    assertTrue(this.startsWith(s), "Expected to start with '$s'. Actual: $this")
}

infix fun CharSequence.`should not start with`(s: CharSequence) = apply {
    assertFalse(this.startsWith(s), "Expected to not start with '$s'. Actual: $this")
}

infix fun CharSequence.`should end with`(s: CharSequence) = apply {
    assertTrue(this.endsWith(s), "Expected to end with '$s'. Actual: $this")
}

infix fun CharSequence.`should not end with`(s: CharSequence) = apply {
    assertFalse(this.endsWith(s), "Expected to not end with '$s'. Actual: $this")
}

infix fun CharSequence.`should contain`(s: CharSequence) = apply {
    assertTrue(this.contains(s), "Expected to contain '$s'. Actual: $this")
}

infix fun CharSequence.`should not contain`(s: CharSequence) = apply {
    assertFalse(this.contains(s), "Expected to not contain '$s'. Actual: $this")
}

infix fun CharSequence.`should contain some`(list: List<CharSequence>) = apply {
    assertTrue(list.any { this.contains(it) }, "Expected to contain some of $list. Actual: $this")
}

infix fun CharSequence.`should contain none`(list: List<CharSequence>) = apply {
    assertFalse(list.any { this.contains(it) }, "Expected to contain none of $list. Actual: $this")
}
