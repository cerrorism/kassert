package com.cerrorism.kassert.string

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class EmptyTest {
    @Test
    fun `empty check should work`() {
        "".`should be empty`()
        "name".`should not be empty`()

        "".`should be null or empty`()
        "name".`should not be null or empty`()
        null.`should be null or empty`()

        "  ".`should be blank`()
        "name".`should not be blank`()

        "  ".`should be null or blank`()
        "name".`should not be null or blank`()
        null.`should be null or blank`()
    }

    @Test
    fun `empty check should generate clear message`() {
        invoking {
            "".`should not be empty`()
        } `should throw` AssertionError::class `with message` "Expected to not be empty."

        invoking {
            "name".`should be empty`()
        } `should throw` AssertionError::class `with message` "Expected to be empty. Actual: name"

        invoking {
            "".`should not be null or empty`()
        } `should throw` AssertionError::class `with message` "Expected to not be null or empty."

        invoking {
            "name".`should be null or empty`()
        } `should throw` AssertionError::class `with message` "Expected to be null or empty. Actual: name"

        invoking {
            "  ".`should not be blank`()
        } `should throw` AssertionError::class `with message` "Expected to not be blank."

        invoking {
            "name".`should be blank`()
        } `should throw` AssertionError::class `with message` "Expected to be blank. Actual: name"

        "  ".`should be null or blank`()
        "name".`should not be null or blank`()

        invoking {
            "  ".`should not be null or blank`()
        } `should throw` AssertionError::class `with message` "Expected to not be null or blank."

        invoking {
            "name".`should be null or blank`()
        } `should throw` AssertionError::class `with message` "Expected to be null or blank. Actual: name"

        invoking {
            null.`should not be null or blank`()
        } `should throw` AssertionError::class `with message` "Expected to not be null or blank."

        invoking {
            null.`should not be null or empty`()
        } `should throw` AssertionError::class `with message` "Expected to not be null or empty."
    }

}
