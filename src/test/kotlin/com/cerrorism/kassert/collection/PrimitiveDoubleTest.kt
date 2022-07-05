package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveDoubleTest {

    @Test
    fun `double array check should work`() {
        val collection = doubleArrayOf(1.0, 2.0, 3.0)
        collection `should contain` 1.0
        collection `should not contain` 5.0
        collection.`should not be empty`()
        doubleArrayOf().`should be empty`()
        2.0 `should be in` collection
        5.0 `should not be in` collection
        collection `should contain some` doubleArrayOf(1.0, 5.0, 6.0)
        collection `should not contain any` doubleArrayOf(5.0, 6.0, 7.0)
        collection `should contain none` doubleArrayOf(5.0, 6.0, 7.0)
        collection `should contain all` doubleArrayOf(1.0, 2.0)
        collection `should contain same` doubleArrayOf(1.0, 3.0, 2.0)
    }
}
