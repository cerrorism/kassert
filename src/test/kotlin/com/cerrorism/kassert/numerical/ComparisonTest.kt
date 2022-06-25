package com.cerrorism.kassert.numerical

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class ComparisonTest {
    @Test
    fun `comparison check should work`() {
        5 `should be greater than` 2
        5 `should not be greater than` 10

        2 `should be less than` 5
        5 `should not be less than` 2

        5 `should be greater than or equal to` 5
        5 `should not be greater than or equal to` 10

        2 `should be less than or equal to` 5
        5 `should not be less than or equal to` 2
    }

    @Test
    fun `comparison check should fail with clear message`() {
        invoking {
            2 `should be greater than` 5
        } `should throw` AssertionError::class `with message` "Expected 2 to be greater than 5"
        invoking {
            10 `should not be greater than` 5
        } `should throw` AssertionError::class `with message` "Expected 10 to not be greater than 5"
        invoking {
            5 `should be less than` 2
        } `should throw` AssertionError::class `with message` "Expected 5 to be less than 2"
        invoking {
            2 `should not be less than` 5
        } `should throw` AssertionError::class `with message` "Expected 2 to not be less than 5"
        invoking {
            5 `should be greater than or equal to` 10
        } `should throw` AssertionError::class `with message` "Expected 5 to be greater than or equal to 10"
        invoking {
            10 `should not be greater than or equal to` 5
        } `should throw` AssertionError::class `with message` "Expected 10 to not be greater than or equal to 5"
        invoking {
            5 `should be less than or equal to` 2
        } `should throw` AssertionError::class `with message` "Expected 5 to be less than or equal to 2"
        invoking {
            2 `should not be less than or equal to` 5
        } `should throw` AssertionError::class `with message` "Expected 2 to not be less than or equal to 5"
    }
}
