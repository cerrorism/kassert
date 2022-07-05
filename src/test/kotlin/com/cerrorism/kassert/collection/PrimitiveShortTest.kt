package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveShortTest {

    @Test
    fun `short array check should work`() {
        val collection = shortArrayOf(1, 2, 3)
        collection `should contain` 1
        collection `should not contain` 5
        collection.`should not be empty`()
        shortArrayOf().`should be empty`()
        2.toShort() `should be in` collection
        5.toShort() `should not be in` collection
        collection `should contain some` shortArrayOf(1, 5, 6)
        collection `should not contain any` shortArrayOf(5, 6, 7)
        collection `should contain none` shortArrayOf(5, 6, 7)
        collection `should contain all` shortArrayOf(1, 2)
        collection `should contain same` shortArrayOf(1, 3, 2)
    }
}
