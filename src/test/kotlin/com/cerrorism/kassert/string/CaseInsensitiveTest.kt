package com.cerrorism.kassert.string

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class CaseInsensitiveTest {
    @Test
    fun `case insensitive check should work`() {
        "name" `should be equal to ignoring case` "nAmE"
        "name" `should not be equal to ignoring case` "abc"

        "name" `should start with ignoring case` "N"
        "age" `should not start with ignoring case` "n"

        "name" `should end with ignoring case` "Me"
        "age" `should not end with ignoring case` "N"

        "name" `should contain ignoring case` "Am"
        "name" `should not contain ignoring case` "abc"

        "I like fluent assertions" `should contain some ignoring case` listOf("Fluent", "NOT", "tesT")
        "I like fluent assertions" `should contain none ignoring case` listOf("test", "compile")
    }

    @Test
    fun `case insensitive check should generate clear message`() {
        invoking {
            "I like fluent assertions" `should contain none ignoring case` listOf("Fluent", "NOT", "tesT")
        } `should throw` AssertionError::class `with message` "Expected to contain none of ${
            listOf("Fluent", "NOT", "tesT")
        } (ignoring case). Actual: I like fluent assertions"

        invoking {
            "I like fluent assertions" `should contain some ignoring case` listOf("test", "compile")
        } `should throw` AssertionError::class `with message` "Expected to contain some of ${
            listOf("test", "compile")
        } (ignoring case). Actual: I like fluent assertions"
    }
}
