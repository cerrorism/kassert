@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

fun Byte.`should be positive`() {
    this `should be greater than` 0
}

fun Short.`should be positive`() {
    this `should be greater than` 0
}

fun Int.`should be positive`() {
    this `should be greater than` 0
}

fun Long.`should be positive`() {
    this `should be greater than` 0
}

fun Float.`should be positive`() {
    this `should be greater than` 0.0f
}

fun Double.`should be positive`() {
    this `should be greater than` 0.0
}

fun Byte.`should be negative`() {
    this `should be less than` 0
}

fun Short.`should be negative`() {
    this `should be less than` 0
}

fun Int.`should be negative`() {
    this `should be less than` 0
}

fun Long.`should be negative`() {
    this `should be less than` 0
}

fun Float.`should be negative`() {
    this `should be less than` 0.0f
}

fun Double.`should be negative`() {
    this `should be less than` 0.0
}
