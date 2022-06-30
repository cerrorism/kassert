package com.cerrorism.kassert.numerical

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class RangesTest {
    @Test
    fun `ranges check should work`() {
        5 `should be in range` 1..10
        5.`should be in range`(1, 10)
        5 `should not be in range` 6..10
        5.`should not be in range`(6, 10)
    }

    @Test
    fun `ranges check should generate clear message`() {
        invoking {
            5 `should not be in range` 1..10
        } `should throw` AssertionError::class `with message` "Expected 5 to not be between (and including) 1 and 10"
    }
}
