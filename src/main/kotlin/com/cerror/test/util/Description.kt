package com.cerror.test.util

fun <T> failureDescription(message: String, expected: T?, actual: T?): String {
    return """
        $message
        | Expected: $expected
        | Actual: $actual 
    """.trimIndent()
}