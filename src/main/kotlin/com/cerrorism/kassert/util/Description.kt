package com.cerrorism.kassert.util

fun <T> failureDescription(message: String, expected: T?, actual: T?): String {
    return """
        $message
        | Expected: $expected
        | Actual: $actual 
    """.trimIndent()
}