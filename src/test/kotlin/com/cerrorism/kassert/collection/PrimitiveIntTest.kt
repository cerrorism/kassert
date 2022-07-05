package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveIntTest {

    @Test
    fun `int array check should work`() {
        val collection = intArrayOf(1, 2, 3)
        collection `should contain` 1
        collection `should not contain` 5
        collection.`should not be empty`()
        intArrayOf().`should be empty`()
        2 `should be in` collection
        5 `should not be in` collection
        collection `should contain some` intArrayOf(1, 5, 6)
        collection `should not contain any` intArrayOf(5, 6, 7)
        collection `should contain none` intArrayOf(5, 6, 7)
        collection `should contain all` intArrayOf(1, 2)
        collection `should contain same` intArrayOf(1, 3, 2)
    }
}