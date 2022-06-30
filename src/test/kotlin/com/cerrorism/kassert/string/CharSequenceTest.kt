package com.cerrorism.kassert.string

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class CharSequenceTest {
    @Test
    fun `char sequence check should work`() {
        "name" `should start with` "n"
        "age" `should not start with` "n"

        "name" `should end with` "me"
        "name" `should not end with` "ee"

        "name" `should contain` "am"
        "name" `should not contain` "abc"

        "I like fluent assertions" `should contain some` listOf("fluent", "not", "test")
        "I like fluent assertions" `should contain none` listOf("test", "compile")
    }

    @Test
    fun `char sequence check should generate clear message`() {
        invoking {
            "name" `should not start with` "n"
        } `should throw` AssertionError::class `with message` "Expected to not start with 'n'. Actual: name"

        invoking {
            "age" `should start with` "n"
        } `should throw` AssertionError::class `with message` "Expected to start with 'n'. Actual: age"

        invoking {
            "name" `should not end with` "me"
        } `should throw` AssertionError::class `with message` "Expected to not end with 'me'. Actual: name"

        invoking {
            "name" `should end with` "ee"
        } `should throw` AssertionError::class `with message` "Expected to end with 'ee'. Actual: name"

        invoking {
            "name" `should not contain` "am"
        } `should throw` AssertionError::class `with message` "Expected to not contain 'am'. Actual: name"

        invoking {
            "name" `should contain` "abc"
        } `should throw` AssertionError::class `with message` "Expected to contain 'abc'. Actual: name"

        invoking {
            "I like fluent assertions" `should contain none` listOf("fluent", "not", "test")
        } `should throw` AssertionError::class `with message` "Expected to contain none of ${
            listOf(
                "fluent",
                "not",
                "test"
            )
        }. Actual: I like fluent assertions"

        invoking {
            "I like fluent assertions" `should contain some` listOf("test", "compile")
        } `should throw` AssertionError::class `with message` "Expected to contain some of ${
            listOf(
                "test",
                "compile"
            )
        }. Actual: I like fluent assertions"
    }
}
