@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue

infix fun CharSequence.`should start with`(s: CharSequence): CharSequence {
    assertTrue(this.startsWith(s), "Expected to start with '$s'. Actual: $this")
    return this
}

infix fun CharSequence.`should not start with`(s: CharSequence): CharSequence {
    assertFalse(this.startsWith(s), "Expected to not start with '$s'. Actual: $this")
    return this
}

infix fun CharSequence.`should end with`(s: CharSequence): CharSequence {
    assertTrue(this.endsWith(s), "Expected to end with '$s'. Actual: $this")
    return this
}

infix fun CharSequence.`should not end with`(s: CharSequence): CharSequence {
    assertFalse(this.endsWith(s), "Expected to not end with '$s'. Actual: $this")
    return this
}

infix fun CharSequence.`should contain`(s: CharSequence): CharSequence {
    assertTrue(this.contains(s), "Expected to contain '$s'. Actual: $this")
    return this
}

infix fun CharSequence.`should not contain`(s: CharSequence): CharSequence {
    assertFalse(this.contains(s), "Expected to not contain '$s'. Actual: $this")
    return this
}

infix fun CharSequence.`should contain some`(list: List<CharSequence>): CharSequence {
    assertTrue(list.any { this.contains(it) }, "Expected to contain some of $list. Actual: $this")
    return this
}

infix fun CharSequence.`should contain none`(list: List<CharSequence>): CharSequence {
    assertFalse(list.any { this.contains(it) }, "Expected to contain none of $list. Actual: $this")
    return this
}
