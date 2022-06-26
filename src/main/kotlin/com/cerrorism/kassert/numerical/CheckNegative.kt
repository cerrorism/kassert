@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

fun Byte.`should be negative`(): Byte {
    return this `should be less than` 0
}

fun Short.`should be negative`(): Short {
    return this `should be less than` 0
}

fun Int.`should be negative`(): Int {
    return this `should be less than` 0
}

fun Long.`should be negative`(): Long {
    return this `should be less than` 0
}

fun Float.`should be negative`(): Float {
    return this `should be less than` 0.0f
}

fun Double.`should be negative`(): Double {
    return this `should be less than` 0.0
}
