@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

fun Byte.`should be negative`() = apply {
    this `should be less than` 0
}

fun Short.`should be negative`() = apply {
    this `should be less than` 0
}

fun Int.`should be negative`() = apply {
    this `should be less than` 0
}

fun Long.`should be negative`() = apply {
    this `should be less than` 0
}

fun Float.`should be negative`() = apply {
    this `should be less than` 0.0f
}

fun Double.`should be negative`() = apply {
    this `should be less than` 0.0
}
