package com.cerrorism.kassert.basic

import com.cerrorism.kassert.exception.and
import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import org.junit.jupiter.api.Test

class NullabilityTest {
    @Test
    fun `nullability check should work for not null value`() {
        val value = 5
        value.`should not be null`()
        invoking {
            value.`should be null`()
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` """
                Value should be null
                | Expected: null
                | Actual: 5
            """.trimIndent()
        }
    }

    @Test
    fun `nullability check should work for null value`() {
        val value: Int? = null
        value.`should be null`()
        invoking {
            value.`should not be null`()
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` "Value should not be null"
        }
    }
}
