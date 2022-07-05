package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class ArrayTest {

    @Test
    fun `array check should work`() {
        val collection = arrayOf(1, 2, 3)
        collection `should contain` 1
        collection `should not contain` 5
        collection.`should not be empty`()
        arrayOf<Int>().`should be empty`()
        2 `should be in` collection
        5 `should not be in` collection
        collection `should contain some` arrayOf(1, 5, 6)
        collection `should not contain any` arrayOf(5, 6, 7)
        collection `should contain none` arrayOf(5, 6, 7)
        collection `should contain all` arrayOf(1, 2)
        collection `should contain same` arrayOf(1, 3, 2)
    }

    @Test
    fun `array check should work for strings`() {
        val collection = arrayOf("a", "ab", "abc")
        collection `should contain all ignoring case` arrayOf("a", "AbC")
        collection `should not contain any ignoring case` arrayOf("c", "Cd")
        collection `should contain some ignoring case` arrayOf("A", "ABC", "CD")
    }
}