package com.cerror.test.basic

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BooleanTest {
    @Test
    fun `assert function should check the condition`() {

        assertTrue(true)
        assertFalse(false)
        Assertions.assertThrows(AssertionError::class.java) {
            assertTrue(false, "this should fail")
        }
        Assertions.assertThrows(AssertionError::class.java) {
            assertFalse(true, "this should fail")
        }
    }

    @Test
    fun `alias function should work`() {
        true.`should be true`()
        false.`should be false`()
        val trueStatement = Int.SIZE_BYTES == 4
        val falseStatement = Long.SIZE_BYTES == 4
        trueStatement.`should be true`("The integer in Kotlin should be 4-bytes")
        falseStatement.`should be false`("The long integer in Kotlin should not be 4-bytes")
        trueStatement.`should not be false`()
        falseStatement.`should not be true`()
    }
}