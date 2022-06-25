package com.cerrorism.kassert.numerical

import org.junit.jupiter.api.Test

class SpecialCasesTest {
    @Test
    fun `special cases check should work for Int`() {
        val positiveValue = 2
        val negativeValue = -2
        positiveValue.`should be positive`()
        negativeValue.`should be negative`()
    }

    @Test
    fun `special cases check should work for Byte`() {
        val positiveValue = 2.toByte()
        val negativeValue = (-2).toByte()
        positiveValue.`should be positive`()
        negativeValue.`should be negative`()
    }

    @Test
    fun `special cases check should work for Short`() {
        val positiveValue = 2.toShort()
        val negativeValue = (-2).toShort()
        positiveValue.`should be positive`()
        negativeValue.`should be negative`()
    }

    @Test
    fun `special cases check should work for Long`() {
        val positiveValue = 2.toLong()
        val negativeValue = (-2).toLong()
        positiveValue.`should be positive`()
        negativeValue.`should be negative`()
    }

    @Test
    fun `special cases check should work for Float`() {
        val positiveValue = 2.toFloat()
        val negativeValue = (-2).toFloat()
        positiveValue.`should be positive`()
        negativeValue.`should be negative`()
    }

    @Test
    fun `special cases check should work for Double`() {
        val positiveValue = 2.toDouble()
        val negativeValue = (-2).toDouble()
        positiveValue.`should be positive`()
        negativeValue.`should be negative`()
    }
}
