package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveBooleanTest {

    @Test
    fun `boolean array check should work`() {
        val collection = booleanArrayOf(true, true)
        collection `should contain` true
        collection `should not contain` false
        collection.`should not be empty`()
        booleanArrayOf().`should be empty`()
        true `should be in` collection
        false `should not be in` collection
        collection `should contain some` booleanArrayOf(true)
        collection `should not contain any` booleanArrayOf(false, false)
        collection `should contain none` booleanArrayOf(false, false)
        collection `should contain all` booleanArrayOf(true)
        collection `should contain same` booleanArrayOf(true, true)
    }
}
