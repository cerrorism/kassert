@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun FloatArray.`should contain`(value: Float) = apply {
    this.toSet() `should contain` value
}

infix fun FloatArray.`should not contain`(value: Float) = apply {
    this.toSet() `should not contain` value
}

infix fun FloatArray.`should contain some`(values: FloatArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun FloatArray.`should contain none`(values: FloatArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun FloatArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun FloatArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Float.`should be in`(values: FloatArray) = apply {
    this `should be in` values.toSet()
}

infix fun Float.`should not be in`(values: FloatArray) = apply {
    this `should not be in` values.toSet()
}

infix fun FloatArray.`should contain all`(values: FloatArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun FloatArray.`should not contain any`(values: FloatArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun FloatArray.`should contain same`(values: FloatArray) = apply {
    this.toList() `should contain same` values.toList()
}
