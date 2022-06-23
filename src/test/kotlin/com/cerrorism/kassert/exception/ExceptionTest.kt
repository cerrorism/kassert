package com.cerrorism.kassert.exception

import com.cerrorism.kassert.basic.`should be equal to`
import com.cerrorism.kassert.basic.`should not be null`
import org.junit.jupiter.api.Test

class ExceptionTest {
    @Test
    fun `exception check should work for throwing`() {
        invoking {
            throw RuntimeException("test exception")
        } `should throw` Exception::class and {
            exception.message `should be equal to` "test exception"
        }
        invoking {
            throw RuntimeException("test exception")
        } `should throw` RuntimeException::class and {
            exception.message `should be equal to` "test exception"
        }

        invoking {
            invoking {
                throw RuntimeException("Kotlin RuntimeException")
            } `should throw` InterruptedException::class
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` "Wrong Exception type thrown. Expected: ${InterruptedException::class}, actual: ${RuntimeException::class}"
        }
    }

    @Test
    fun `no exception check should work for no throwing`() {
        invoking {
            5 / 2
        }.`should not throw`()
        invoking {
            invoking {
                5 / 2
            } `should throw` InterruptedException::class
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` "There was an Exception (type: ${InterruptedException::class}) expected to be thrown, but nothing was thrown."
        }
    }

    @Test
    fun `wrong exception check should work for throwing`() {
        invoking {
            5 / 2
        } `should not throw` AssertionError::class

        invoking {
            throw RuntimeException("Kotlin RuntimeException")
        } `should not throw` InterruptedException::class

        invoking {
            throw RuntimeException("Kotlin RuntimeException")
        } `should not throw` InterruptedException::class and {
            exception.`should not be null`()
            exception!!.message `should be equal to` "Kotlin RuntimeException"
        }

        invoking {
            invoking {
                throw RuntimeException("Kotlin RuntimeException")
            }.`should not throw`()
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` "Expected no Exception to be thrown. Actual: ${RuntimeException::class}"
        }
    }
}