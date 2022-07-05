package com.cerrorism.kassert.collection

import org.junit.jupiter.api.Test

class MapTest {
    @Test
    fun `map check should work`() {
        val map = mapOf(
            "Key1" to "Value1",
            "Key2" to "Value2"
        )
        map `should have key` "Key1"
        map `should not have key` "NotExisting"
        map `should have value` "Value1"
        map `should not have value` "NotExisting"
        map `should contain` ("Key1" to "Value1")
        map `should not contain` ("Key1" to "ValueNotExisting")
        map.`should not be empty`()
        mapOf<String, String>().`should be empty`()
    }
}
