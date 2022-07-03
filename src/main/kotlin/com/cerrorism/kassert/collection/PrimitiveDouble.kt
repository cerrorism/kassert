@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun DoubleArray.`should contain`(value: Double) = apply {
    this.toSet() `should contain` value
}

infix fun DoubleArray.`should not contain`(value: Double) = apply {
    this.toSet() `should not contain` value
}

infix fun DoubleArray.`should contain some`(values: DoubleArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun DoubleArray.`should contain none`(values: DoubleArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun DoubleArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun DoubleArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Double.`should be in`(values: DoubleArray) = apply {
    this `should be in` values.toSet()
}

infix fun Double.`should not be in`(values: DoubleArray) = apply {
    this `should not be in` values.toSet()
}

infix fun DoubleArray.`should contain all`(values: DoubleArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun DoubleArray.`should not contain any`(values: DoubleArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun DoubleArray.`should contain same`(values: DoubleArray) = apply {
    this.toList() `should contain same` values.toList()
}
