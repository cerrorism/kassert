@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun BooleanArray.`should contain`(value: Boolean) = apply {
    this.toSet() `should contain` value
}

infix fun BooleanArray.`should not contain`(value: Boolean) = apply {
    this.toSet() `should not contain` value
}

infix fun BooleanArray.`should contain some`(values: BooleanArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun BooleanArray.`should contain none`(values: BooleanArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun BooleanArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun BooleanArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Boolean.`should be in`(values: BooleanArray) = apply {
    this `should be in` values.toSet()
}

infix fun Boolean.`should not be in`(values: BooleanArray) = apply {
    this `should not be in` values.toSet()
}

infix fun BooleanArray.`should contain all`(values: BooleanArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun BooleanArray.`should not contain any`(values: BooleanArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun BooleanArray.`should contain same`(values: BooleanArray) = apply {
    this.toList() `should contain same` values.toList()
}
