@file:Suppress("FunctionName")

package com.cerrorism.kassert.exception

import com.cerrorism.kassert.basic.`should be equal to`

class ExceptionResult<out T : Throwable>(val exception: T)
class NotThrownExceptionResult(val exception: Throwable? = null)

infix fun NotThrownExceptionResult.and(block: NotThrownExceptionResult.() -> Unit): NotThrownExceptionResult {
    return this.apply(block)
}

infix fun <T : Throwable> ExceptionResult<T>.`with message`(message: String): ExceptionResult<T> {
    this.exception.message `should be equal to` message
    return this
}
