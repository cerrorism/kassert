@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun CharArray.`should contain`(value: Char) = apply {
    this.toSet() `should contain` value
}

infix fun CharArray.`should not contain`(value: Char) = apply {
    this.toSet() `should not contain` value
}

infix fun CharArray.`should contain some`(values: CharArray) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun CharArray.`should contain none`(values: CharArray) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun CharArray.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun CharArray.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun Char.`should be in`(values: CharArray) = apply {
    this `should be in` values.toSet()
}

infix fun Char.`should not be in`(values: CharArray) = apply {
    this `should not be in` values.toSet()
}

infix fun CharArray.`should contain all`(values: CharArray) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun CharArray.`should not contain any`(values: CharArray) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun CharArray.`should contain same`(values: CharArray) = apply {
    this.toList() `should contain same` values.toList()
}
