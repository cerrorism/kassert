@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue


infix fun CharSequence.`should match`(regex: Regex) = apply {
    assertTrue(this.matches(regex), "Expected to match $regex. Actual: $this")
}

infix fun CharSequence.`should match`(pattern: String) = apply {
    this `should match` Regex(pattern)
}

infix fun CharSequence.`should not match`(regex: Regex) = apply {
    assertFalse(this.matches(regex), "Expected to not match $regex. Actual: $this")
}

infix fun CharSequence.`should not match`(pattern: String) = apply {
    this `should not match` Regex(pattern)
}
