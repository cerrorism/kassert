package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class PrimitiveCharTest {
    @Test
    fun `char array check should work`() {
        val collection = charArrayOf('1', '2', '3')
        collection `should contain` '1'
        collection `should not contain` '5'
        collection.`should not be empty`()
        charArrayOf().`should be empty`()
        '2' `should be in` collection
        '5' `should not be in` collection
        collection `should contain some` charArrayOf('1', '5', '6')
        collection `should not contain any` charArrayOf('5', '6', '7')
        collection `should contain none` charArrayOf('5', '6', '7')
        collection `should contain all` charArrayOf('1', '2')
        collection `should contain same` charArrayOf('1', '3', '2')
    }
}