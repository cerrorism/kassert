package com.cerrorism.kassert.collection

import com.cerrorism.kassert.exception.invoking
import com.cerrorism.kassert.exception.`should throw`
import com.cerrorism.kassert.exception.`with message`
import org.junit.jupiter.api.Test

class CollectionTest {
    @Test
    fun `collection check should work`() {
        val collection = listOf(1, 2, 3)
        collection `should contain` 1
        collection `should not contain` 5
        collection.`should not be empty`()
        listOf<Int>().`should be empty`()
        2 `should be in` collection
        5 `should not be in` collection
        collection `should contain some` listOf(1, 5, 6)
        collection `should not contain any` listOf(5, 6, 7)
        collection `should contain none` listOf(5, 6, 7)
        collection `should contain all` listOf(1, 2)
        collection `should contain same` listOf(1, 3, 2)
    }

    @Test
    fun `collection check should work for strings`() {
        val collection = listOf("a", "ab", "abc")
        collection `should contain all ignoring case` listOf("a", "AbC")
        collection `should not contain any ignoring case` listOf("c", "Cd")
        collection `should contain some ignoring case` listOf("A", "ABC", "CD")
    }

    @Test
    fun `collection check should fail with clear message`() {
        val collection = listOf(1, 2, 3)
        invoking {
            collection `should contain` 5
        } `should throw` AssertionError::class `with message` "Expected to contain '5'. Actual: [1, 2, 3]"
        invoking {
            collection `should not contain` 1
        } `should throw` AssertionError::class `with message` "Expected to not contain '1'. Actual: [1, 2, 3]"
        invoking {
            listOf<Int>().`should not be empty`()
        } `should throw` AssertionError::class `with message` "Expected to not be empty."
        invoking {
            collection.`should be empty`()
        } `should throw` AssertionError::class `with message` "Expected to be empty. Actual: [1, 2, 3]"
        invoking {
            5 `should be in` collection
        } `should throw` AssertionError::class `with message` "'5' should be in [1, 2, 3]"
        invoking {
            2 `should not be in` collection
        } `should throw` AssertionError::class `with message` "'2' should not be in [1, 2, 3]"
        invoking {
            collection `should contain some` listOf(5, 6)
        } `should throw` AssertionError::class `with message` """
            Expected to contain some of [5, 6]. Actual: [1, 2, 3]
        """.trimIndent()

        invoking {
            collection `should not contain any` listOf(1, 5)
        } `should throw` AssertionError::class `with message` """
            Expected to not contain any values
            | Expected: [1, 5]
            | Actual: [1, 2, 3]
        """.trimIndent()
        invoking {
            collection `should contain none` listOf(1, 5)
        } `should throw` AssertionError::class `with message` """
            Expected to contain none of [1, 5]. Actual: [1, 2, 3]
        """.trimIndent()
        invoking {
            collection `should contain all` listOf(1, 2, 5)
        } `should throw` AssertionError::class `with message` """
            Expected to contain all values
            | Expected: [1, 2, 5]
            | Actual: [1, 2, 3]
        """.trimIndent()
        invoking {
            collection `should contain same` listOf(1, 3)
        } `should throw` AssertionError::class `with message` """
            Expected to contain same values
            | Expected: [1, 3]
            | Actual: [1, 2, 3]
        """.trimIndent()
        invoking {
            collection `should contain same` listOf(1, 3, 5, 7, 9)
        } `should throw` AssertionError::class `with message` """
            Expected to contain same values
            | Expected: [1, 3, 5, 7, 9]
            | Actual: [1, 2, 3]
        """.trimIndent()
    }

    @Test
    fun `collection check should fail with clear message for strings`() {
        val collection = listOf("a", "ab", "abc")

        invoking {
            collection `should contain all ignoring case` listOf("b", "AbC")
        } `should throw` AssertionError::class `with message` """
            Expected to contain all values (ignoring case)
            | Expected: [b, AbC]
            | Actual: [a, ab, abc]
        """.trimIndent()

        invoking {
            collection `should not contain any ignoring case` listOf("A", "Cd")
        } `should throw` AssertionError::class `with message` """
            Expected to not contain any values (ignoring case)
            | Expected: [A, Cd]
            | Actual: [a, ab, abc]
        """.trimIndent()

        invoking {
            collection `should contain some ignoring case` listOf("AA", "ABCD", "CD")
        } `should throw` AssertionError::class `with message` """
            Expected to contain some values (ignoring case)
            | Expected: [AA, ABCD, CD]
            | Actual: [a, ab, abc]
        """.trimIndent()
    }
}
