@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue
import com.cerrorism.kassert.util.failureDescription

infix fun <T> Collection<T>.`should contain`(value: T) = apply {
    assertTrue(this.contains(value), "Expected to contain '$value'. Actual: $this")
}

infix fun <T> Collection<T>.`should not contain`(value: T) = apply {
    assertFalse(this.contains(value), "Expected to not contain '$value'. Actual: $this")
}

infix fun <T> Collection<T>.`should contain some`(values: Collection<T>) = apply {
    assertTrue(values.any { this.contains(it) }, "Expected to contain some of $values. Actual: $this")
}

infix fun <T> Collection<T>.`should contain none`(values: Collection<T>) = apply {
    assertFalse(values.any { this.contains(it) }, "Expected to contain none of $values. Actual: $this")
}

fun <T> Collection<T>.`should be empty`() = apply {
    assertTrue(this.isEmpty(), "Expected to be empty. Actual: $this")
}

fun <T> Collection<T>.`should not be empty`() = apply {
    assertFalse(this.isEmpty(), "Expected to not be empty.")
}

infix fun <T> T.`should be in`(values: Collection<T>) = apply {
    assertTrue(values.contains(this), "'$this' should be in $values")
}

infix fun <T> T.`should not be in`(values: Collection<T>) = apply {
    assertFalse(values.contains(this), "'$this' should not be in $values")
}

infix fun <T> Collection<T>.`should contain all`(values: Collection<T>) = apply {
    assertTrue(values.all { this.contains(it) }, failureDescription("Expected to contain all values", values, this))
}

infix fun <T> Collection<T>.`should not contain any`(values: Collection<T>) = apply {
    assertFalse(
        values.any { this.contains(it) },
        failureDescription("Expected to not contain any values", values, this)
    )
}

infix fun <T> Collection<T>.`should contain same`(values: Collection<T>) = apply {
    val remaining = this.toMutableList()
    val containsAllValues = values.fold(true) { sameSoFar, v ->
        sameSoFar && remaining.remove(v)
    }
    val same = containsAllValues && remaining.isEmpty()
    assertTrue(same, failureDescription("Expected to contain same values", values, this))
}

infix fun Collection<String>.`should contain all ignoring case`(values: Collection<String>) = apply {
    val lowerCaseSet = this.toSet().map(String::lowercase)
    val lowerCaseValues = values.toSet().map(String::lowercase)
    assertTrue(
        lowerCaseValues.all { lowerCaseSet.contains(it.lowercase()) },
        failureDescription("Expected to contain all values (ignoring case)", values, this)
    )
}

infix fun Collection<String>.`should not contain any ignoring case`(values: Collection<String>) = apply {
    val lowerCaseSet = this.toSet().map(String::lowercase)
    val lowerCaseValues = values.toSet().map(String::lowercase)
    assertFalse(
        lowerCaseValues.any { lowerCaseSet.contains(it.lowercase()) },
        failureDescription("Expected to not contain any values (ignoring case)", values, this)
    )
}

infix fun Collection<String>.`should contain some ignoring case`(values: Collection<String>) = apply {
    val lowerCaseSet = this.toSet().map(String::lowercase)
    val lowerCaseValues = values.toSet().map(String::lowercase)
    assertTrue(
        lowerCaseValues.any { lowerCaseSet.contains(it.lowercase()) },
        failureDescription("Expected to contain some values (ignoring case)", values, this)
    )
}
