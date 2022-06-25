@file:Suppress("FunctionName")

package com.cerrorism.kassert.exception

import kotlin.reflect.KClass
import kotlin.test.fail

interface Function {
    fun run()
}

fun invoking(function: () -> Any?): Function {
    return object : Function {
        override fun run() {
            function()
        }
    }
}

inline infix fun <reified T : Throwable> Function.`should throw`(expectedException: KClass<T>): ExceptionResult<T> {
    try {
        this.apply { }
        this.run()
    } catch (e: Throwable) {
        when (e) {
            is T -> return ExceptionResult(e)
            else -> fail("Wrong Exception type thrown. Expected: $expectedException, actual: ${e::class}")
        }
    }
    fail("There was an Exception (type: $expectedException) expected to be thrown, but nothing was thrown.")
}

fun Function.`should not throw`() {
    try {
        this.run()
    } catch (e: Throwable) {
        fail("Expected no Exception to be thrown. Actual: ${e::class}")
    }
}

inline infix fun <reified T : Throwable> Function.`should not throw`(expectedException: KClass<T>): NotThrownExceptionResult {
    return try {
        this.run()
        NotThrownExceptionResult()
    } catch (e: Throwable) {
        if (e is T) {
            fail("Expected no $expectedException to be thrown. Actual: ${e::class}")
        }
        NotThrownExceptionResult(e)
    }
}