package com.cerrorism.kassert.numerical

import org.junit.jupiter.api.Test

class RangesTest {
    @Test
    fun `ranges check should work`() {
        5 `should be in range` 1..10
        5.`should be in range`(1, 10)
        5 `should not be in range` 6..10
        5.`should not be in range`(6, 10)
    }
}
