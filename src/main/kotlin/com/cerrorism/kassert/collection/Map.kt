@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

import com.cerrorism.kassert.basic.assertFalse
import com.cerrorism.kassert.basic.assertTrue

infix fun <K, V> Map<K, V>.`should have key`(key: K) = apply {
    assertTrue(this.containsKey(key), "Expect to have key '$key'. Actual: $this")
}

infix fun <K, V> Map<K, V>.`should not have key`(key: K) = apply {
    assertFalse(this.containsKey(key), "Expect to not have key '$key'. Actual: $this")
}

infix fun <K, V> Map<K, V>.`should have value`(value: V) = apply {
    assertTrue(this.containsValue(value), "Expect to have value '$value'. Actual: $this")
}

infix fun <K, V> Map<K, V>.`should not have value`(value: V) = apply {
    assertFalse(this.containsValue(value), "Expect to not have value '$value'. Actual: $this")
}

infix fun <K, V> Map<K, V>.`should contain`(entry: Pair<K, V>) = apply {
    assertTrue(this[entry.first] == entry.second, "Expect to contain $entry. Actual: $this")
}

infix fun <K, V> Map<K, V>.`should not contain`(entry: Pair<K, V>) = apply {
    assertFalse(this[entry.first] == entry.second, "Expect to contain $entry. Actual: $this")
}

fun <K, V> Map<K, V>.`should be empty`() = apply {
    assertTrue(this.isEmpty(), "Expect to be empty. Actual: $this")
}

fun <K, V> Map<K, V>.`should not be empty`() = apply {
    assertFalse(this.isEmpty(), "Expect to not be empty.")
}
