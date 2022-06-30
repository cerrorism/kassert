package com.cerrorism.kassert.string

import org.junit.jupiter.api.Test

class RegexTest {
    @Test
    fun `regex check should work`() {
        "name" `should match` "\\w+"
        "name" `should not match` "\\d+"

        "name" `should match` Regex("\\w+")
        "name" `should not match` Regex("\\d+")
    }
}
