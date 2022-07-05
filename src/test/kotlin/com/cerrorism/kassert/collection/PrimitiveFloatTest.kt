package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveFloatTest {

    @Test
    fun `float array check should work`() {
        val collection = floatArrayOf(1.0f, 2.0f, 3.0f)
        collection `should contain` 1.0f
        collection `should not contain` 5.0f
        collection.`should not be empty`()
        floatArrayOf().`should be empty`()
        2.0f `should be in` collection
        5.0f `should not be in` collection
        collection `should contain some` floatArrayOf(1.0f, 5.0f, 6.0f)
        collection `should not contain any` floatArrayOf(5.0f, 6.0f, 7.0f)
        collection `should contain none` floatArrayOf(5.0f, 6.0f, 7.0f)
        collection `should contain all` floatArrayOf(1.0f, 2.0f)
        collection `should contain same` floatArrayOf(1.0f, 3.0f, 2.0f)
    }
}
