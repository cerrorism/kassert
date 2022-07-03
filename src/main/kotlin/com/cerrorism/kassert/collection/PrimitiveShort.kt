@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun ShortArray.`should contain`(value: Short) = apply {
    this.toSet() `should contain` value
}

infix fun ShortArray.`should not contain`(value: Short) = apply {
    this.toSet() `should not contain` value
}

infix fun ShortArray.`should contain some`(values: ShortArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun ShortArray.`should contain none`(values: ShortArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun ShortArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun ShortArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Short.`should be in`(values: ShortArray) = apply {
    this `should be in` values.toSet()
}

infix fun Short.`should not be in`(values: ShortArray) = apply {
    this `should not be in` values.toSet()
}

infix fun ShortArray.`should contain all`(values: ShortArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun ShortArray.`should not contain any`(values: ShortArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun ShortArray.`should contain same`(values: ShortArray) = apply {
    this.toList() `should contain same` values.toList()
}
