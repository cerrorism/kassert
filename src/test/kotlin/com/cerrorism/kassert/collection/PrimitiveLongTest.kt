package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveLongTest {

    @Test
    fun `long array check should work`() {
        val collection = longArrayOf(1, 2, 3)
        collection `should contain` 1
        collection `should not contain` 5
        collection.`should not be empty`()
        longArrayOf().`should be empty`()
        2L `should be in` collection
        5L `should not be in` collection
        collection `should contain some` longArrayOf(1, 5, 6)
        collection `should not contain any` longArrayOf(5, 6, 7)
        collection `should contain none` longArrayOf(5, 6, 7)
        collection `should contain all` longArrayOf(1, 2)
        collection `should contain same` longArrayOf(1, 3, 2)
    }
}