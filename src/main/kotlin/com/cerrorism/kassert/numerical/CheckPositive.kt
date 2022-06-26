@file:Suppress("FunctionName")

package com.cerrorism.kassert.numerical

fun Byte.`should be positive`(): Byte {
    return this `should be greater than` 0
}

fun Short.`should be positive`(): Short {
    return this `should be greater than` 0
}

fun Int.`should be positive`(): Int {
    return this `should be greater than` 0
}

fun Long.`should be positive`(): Long {
    return this `should be greater than` 0
}

fun Float.`should be positive`(): Float {
    return this `should be greater than` 0.0f
}

fun Double.`should be positive`(): Double {
    return this `should be greater than` 0.0
}
