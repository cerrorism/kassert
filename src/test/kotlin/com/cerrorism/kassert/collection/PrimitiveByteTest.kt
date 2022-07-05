package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveByteTest {

    @Test
    fun `byte array check should work`() {
        val collection = byteArrayOf(1, 2, 3)
        collection `should contain` 1
        collection `should not contain` 5
        collection.`should not be empty`()
        byteArrayOf().`should be empty`()
        2.toByte() `should be in` collection
        5.toByte() `should not be in` collection
        collection `should contain some` byteArrayOf(1, 5, 6)
        collection `should not contain any` byteArrayOf(5, 6, 7)
        collection `should contain none` byteArrayOf(5, 6, 7)
        collection `should contain all` byteArrayOf(1, 2)
        collection `should contain same` byteArrayOf(1, 3, 2)
    }
}
