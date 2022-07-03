@file:Suppress("FunctionName")

package com.cerrorism.kassert.basic

import com.cerrorism.kassert.util.failureDescription
import kotlin.reflect.KClass

inline infix fun <reified T1, reified T2 : Any> T1.`should be instance of`(expectedClass: KClass<T2>) = apply {
    assertTrue(this is T2, failureDescription("Value should be instance of the given class", expectedClass, T1::class))
}

inline infix fun <reified T1, reified T2 : Any> T1.`should not be instance of`(expectedClass: KClass<T2>) = apply {
    assertFalse(this is T2, failureDescription("Value should be instance of the given class", expectedClass, T1::class))
}
