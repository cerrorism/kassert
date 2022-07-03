@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun LongArray.`should contain`(value: Long) = apply {
    this.toSet() `should contain` value
}

infix fun LongArray.`should not contain`(value: Long) = apply {
    this.toSet() `should not contain` value
}

infix fun LongArray.`should contain some`(values: LongArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun LongArray.`should contain none`(values: LongArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun LongArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun LongArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Long.`should be in`(values: LongArray) = apply {
    this `should be in` values.toSet()
}

infix fun Long.`should not be in`(values: LongArray) = apply {
    this `should not be in` values.toSet()
}

infix fun LongArray.`should contain all`(values: LongArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun LongArray.`should not contain any`(values: LongArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun LongArray.`should contain same`(values: LongArray) = apply {
    this.toList() `should contain same` values.toList()
}
