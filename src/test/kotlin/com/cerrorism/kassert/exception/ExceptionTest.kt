package com.cerrorism.kassert.exception

import com.cerrorism.kassert.basic.`should be equal to`
import com.cerrorism.kassert.basic.`should not be null`
import org.junit.jupiter.api.Test

class ExceptionTest {

    class TestException(message: String) : RuntimeException(message)

    @Test
    fun `exception check should work for throwing with super class exception`() {
        invoking {
            throw TestException("test exception")
        } `should throw` Exception::class and {
            exception.message `should be equal to` "test exception"
        }
    }

    @Test
    fun `exception check should work for throwing with exact class exception`() {
        invoking {
            throw TestException("test exception")
        } `should throw` RuntimeException::class and {
            exception.message `should be equal to` "test exception"
        }
    }

    @Test
    fun `exception check should work for throwing with wrong class exception`() {
        invoking {
            invoking {
                throw TestException("Kotlin RuntimeException")
            } `should throw` InterruptedException::class
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` "Wrong Exception type thrown. " +
                    "Expected: ${InterruptedException::class}, actual: ${TestException::class}"
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
            exception.message `should be equal to` "There was an Exception (type: ${InterruptedException::class})" +
                    " expected to be thrown, but nothing was thrown."
        }
    }

    @Test
    fun `wrong exception check should work for no throwing`() {
        invoking {
            5 / 2
        } `should not throw` AssertionError::class
    }

    @Test
    fun `wrong exception check should work for throwing different type`() {
        invoking {
            throw TestException("Kotlin RuntimeException")
        } `should not throw` InterruptedException::class and {
            exception.`should not be null`()
            exception!!.message `should be equal to` "Kotlin RuntimeException"
        }
    }

    @Test
    fun `wrong exception check should work with a clear message`() {
        invoking {
            invoking {
                throw TestException("Kotlin RuntimeException")
            }.`should not throw`()
        } `should throw` AssertionError::class and {
            exception.message `should be equal to` "Expected no Exception to be thrown. " +
                    "Actual: ${TestException::class}"
        }
    }
}
