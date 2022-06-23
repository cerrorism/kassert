package com.cerrorism.kassert.basic

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class FailTest {
    @Test
    fun `fail function should work`() {
        val testErrorMessage = "test message"
        invoking {
            fail(testErrorMessage)
        } `should throw` AssertionError::class `with message` testErrorMessage
    }
}