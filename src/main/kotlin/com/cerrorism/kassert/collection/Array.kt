@file:Suppress("FunctionName")

package com.cerrorism.kassert.collection

infix fun <T> Array<T>.`should contain`(value: T) = apply {
    this.toSet() `should contain` value
}

infix fun <T> Array<T>.`should not contain`(value: T) = apply {
    this.toSet() `should not contain` value
}

infix fun <T> Array<T>.`should contain some`(values: Array<T>) = apply {
    this.toSet() `should contain some` values.toSet()
}

infix fun <T> Array<T>.`should contain none`(values: Array<T>) = apply {
    this.toSet() `should contain none` values.toSet()
}

fun <T> Array<T>.`should be empty`() = apply {
    this.toList().`should be empty`()
}

fun <T> Array<T>.`should not be empty`() = apply {
    this.toList().`should not be empty`()
}

infix fun <T> T.`should be in`(values: Array<T>) = apply {
    this `should be in` values.toSet()
}

infix fun <T> T.`should not be in`(values: Array<T>) = apply {
    this `should not be in` values.toSet()
}

infix fun <T> Array<T>.`should contain all`(values: Array<T>) = apply {
    this.toSet() `should contain all` values.toSet()
}

infix fun <T> Array<T>.`should not contain any`(values: Array<T>) = apply {
    this.toSet() `should not contain any` values.toSet()
}

infix fun <T> Array<T>.`should contain same`(values: Array<T>) = apply {
    this.toList() `should contain same` values.toList()
}

infix fun Array<String>.`should contain all ignoring case`(values: Array<String>) = apply {
    this.toSet() `should contain all ignoring case` values.toSet()
}

infix fun Array<String>.`should not contain any ignoring case`(values: Array<String>) = apply {
    this.toSet() `should not contain any ignoring case` values.toSet()
}

infix fun Array<String>.`should contain some ignoring case`(values: Array<String>) = apply {
    this.toSet() `should contain some ignoring case` values.toSet()
}
