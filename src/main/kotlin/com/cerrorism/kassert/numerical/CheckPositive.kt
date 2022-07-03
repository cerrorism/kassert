@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

fun Byte.`should be positive`() = apply {
    this `should be greater than` 0
}

fun Short.`should be positive`() = apply {
    this `should be greater than` 0
}

fun Int.`should be positive`() = apply {
    this `should be greater than` 0
}

fun Long.`should be positive`() = apply {
    this `should be greater than` 0
}

fun Float.`should be positive`() = apply {
    this `should be greater than` 0.0f
}

fun Double.`should be positive`() = apply {
    this `should be greater than` 0.0
}
