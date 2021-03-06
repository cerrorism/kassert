package com.cerrorism.kassert.basic

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class SubTypesTest {
    interface SuperClass
    class SubClass : SuperClass
    class UnrelatedClass

    @Test
    fun `sub types check should work for super class and sub class`() {
        val value = SubClass()
        value `should be instance of` SubClass::class
        value `should be instance of` SuperClass::class
        invoking {
            value `should be instance of` UnrelatedClass::class
        } `should throw` AssertionError::class `with message` """
                Value should be instance of the given class
                | Expected: ${UnrelatedClass::class}
                | Actual: ${SubClass::class}
            """.trimIndent()
    }
}
