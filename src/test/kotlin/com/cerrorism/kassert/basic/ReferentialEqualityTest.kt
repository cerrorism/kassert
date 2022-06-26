package com.cerrorism.kassert.basic

import com.cerrorism.kassert.exception.and
import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import org.junit.jupiter.api.Test

class ReferentialEqualityTest {
    data class TestDataClass(val first: String, val second: String)

    @Test
    fun `referential equality check should work on identical references`() {
        val value1 = TestDataClass("foo", "bar")
        val value2 = value1
        value1 `should be` value2
        invoking {
            value1 `should not be` value2
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` """
                References should not be the same
                | Expected: TestDataClass(first=foo, second=bar)
                | Actual: TestDataClass(first=foo, second=bar)
            """.trimIndent()
        }
    }

    @Test
    fun `referential equality check should work on different references`() {
        val value1 = TestDataClass("foo", "bar")
        val value2 = TestDataClass("foo", "bar")
        value1 `should not be` value2
        invoking {
            value1 `should be` value2
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` """
                References should be the same
                | Expected: TestDataClass(first=foo, second=bar)
                | Actual: TestDataClass(first=foo, second=bar)
            """.trimIndent()
        }
    }
}
