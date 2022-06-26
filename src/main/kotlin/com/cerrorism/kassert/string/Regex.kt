@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue


infix fun CharSequence.`should match`(regex: Regex): CharSequence {
    assertTrue(this.matches(regex), "Expected to match $regex. Actual: $this")
    return this
}

infix fun CharSequence.`should match`(pattern: String): CharSequence {
    return this `should match` Regex(pattern)
}

infix fun CharSequence.`should not match`(regex: Regex): CharSequence {
    assertFalse(this.matches(regex), "Expected to not match $regex. Actual: $this")
    return this
}

infix fun CharSequence.`should not match`(pattern: String): CharSequence {
    return this `should not match` Regex(pattern)
}
