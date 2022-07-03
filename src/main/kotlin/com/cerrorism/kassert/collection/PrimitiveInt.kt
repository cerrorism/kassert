@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun IntArray.`should contain`(value: Int) = apply {
    this.toSet() `should contain` value
}

infix fun IntArray.`should not contain`(value: Int) = apply {
    this.toSet() `should not contain` value
}

infix fun IntArray.`should contain some`(values: IntArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun IntArray.`should contain none`(values: IntArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun IntArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun IntArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Int.`should be in`(values: IntArray) = apply {
    this `should be in` values.toSet()
}

infix fun Int.`should not be in`(values: IntArray) = apply {
    this `should not be in` values.toSet()
}

infix fun IntArray.`should contain all`(values: IntArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun IntArray.`should not contain any`(values: IntArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun IntArray.`should contain same`(values: IntArray) = apply {
    this.toList() `should contain same` values.toList()
}
