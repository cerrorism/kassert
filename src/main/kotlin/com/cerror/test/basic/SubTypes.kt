@file:Suppress("FunctionName")
package com.cerror.test.basic

import com.cerror.test.util.failureDescription

inline infix fun <reified T1, reified T2> T1.`should be instance of`(expectedClass: Class<T2>) {
    assertTrue(this is T2, failureDescription("Value should be instance of the given class", expectedClass, T1::class.java))
}

inline infix fun <reified T1, reified T2> T1.`should not be instance of`(expectedClass: Class<T2>) {
    assertFalse(this is T2, failureDescription("Value should be instance of the given class", expectedClass, T1::class.java))
}
