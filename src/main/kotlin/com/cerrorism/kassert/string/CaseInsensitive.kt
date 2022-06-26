@file:Suppress("FunctionName")

package com.cerrorism.kassert.string

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue

infix fun String?.`should be equal to ignoring case`(s: String?): String? {
    assertTrue(this.equals(s, ignoreCase = true), "Expected to be equal to '$s' (ignoring case). Actual: $this")
    return this
}

infix fun String?.`should not be equal to ignoring case`(s: String?): String? {
    assertFalse(this.equals(s, ignoreCase = true), "Expected to not be equal to '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should start with ignoring case`(s: CharSequence): CharSequence {
    assertTrue(this.startsWith(s, ignoreCase = true), "Expected to start with '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should not start with ignoring case`(s: CharSequence): CharSequence {
    assertFalse(this.startsWith(s, ignoreCase = true), "Expected to not start with '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should end with ignoring case`(s: CharSequence): CharSequence {
    assertTrue(this.endsWith(s, ignoreCase = true), "Expected to end with '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should not end with ignoring case`(s: CharSequence): CharSequence {
    assertFalse(this.endsWith(s, ignoreCase = true), "Expected to not end with '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should contain ignoring case`(s: CharSequence): CharSequence {
    assertTrue(this.contains(s, ignoreCase = true), "Expected to contain '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should not contain ignoring case`(s: CharSequence): CharSequence {
    assertFalse(this.contains(s, ignoreCase = true), "Expected to not contain '$s' (ignoring case). Actual: $this")
    return this
}

infix fun CharSequence.`should contain some ignoring case`(list: List<CharSequence>): CharSequence {
    assertTrue(
        list.any { this.contains(it, ignoreCase = true) },
        "Expected to contain some of $list (ignoring case). Actual: $this"
    )
    return this
}

infix fun CharSequence.`should contain none ignoring case`(list: List<CharSequence>): CharSequence {
    assertFalse(
        list.any { this.contains(it, ignoreCase = true) },
        "Expected to contain none of $list (ignoring case). Actual: $this"
    )
    return this
}
