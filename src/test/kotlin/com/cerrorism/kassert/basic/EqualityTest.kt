package com.cerrorism.kassert.basic

import com.cerrorism.kassert.exception.and
import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import org.junit.jupiter.api.Test

class EqualityTest {
    @Test
    fun `equality check should work for basic type`() {
        240 `should be equal to` 240
        240 `should not be equal to` 43
    }

    data class TestDataClass(val first: String, val second: String)

    @Test
    fun `equality check should work for data class`() {
        TestDataClass("foo", "bar") `should be equal to` TestDataClass("foo", "bar")
        TestDataClass("foo", "bar") `should not be equal to` TestDataClass("not", "equal")
    }

    @Test
    fun `failed check should have a user friendly message`() {
        val obj1 = TestDataClass("foo", "bar")
        val obj2 = TestDataClass("not", "equal")

        invoking {
            obj1 `should be equal to` obj2
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` """
                Values should be equal
                | Expected: $obj2
                | Actual: $obj1
            """.trimIndent()
        }
    }
}