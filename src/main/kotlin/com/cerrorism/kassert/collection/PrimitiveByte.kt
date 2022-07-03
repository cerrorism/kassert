@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun ByteArray.`should contain`(value: Byte) = apply {
    this.toSet() `should contain` value
}

infix fun ByteArray.`should not contain`(value: Byte) = apply {
    this.toSet() `should not contain` value
}

infix fun ByteArray.`should contain some`(values: ByteArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun ByteArray.`should contain none`(values: ByteArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun ByteArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun ByteArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Byte.`should be in`(values: ByteArray) = apply {
    this `should be in` values.toSet()
}

infix fun Byte.`should not be in`(values: ByteArray) = apply {
    this `should not be in` values.toSet()
}

infix fun ByteArray.`should contain all`(values: ByteArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun ByteArray.`should not contain any`(values: ByteArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun ByteArray.`should contain same`(values: ByteArray) = apply {
    this.toList() `should contain same` values.toList()
}
