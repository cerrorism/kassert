# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Kassert is a Kotlin assertion library that provides human-readable assertions using infix notation and extension functions. It's a simplified, JVM-focused rewrite of the Kluent library.

## Build System & Commands

This project uses Gradle with Kotlin DSL. Use `gradle` command directly as the wrapper has line ending issues.

**Core Commands:**
- `./gradlew build` or `gradle build` - Build the project and run tests
- `./gradlew test` or `gradle test` - Run the test suite
- `./gradlew clean` or `gradle clean` - Clean build artifacts
- `./gradlew check` or `gradle check` - Run all verification tasks

**Development Commands:**
- `./gradlew build` - Full build including tests (used in CI)
- `./gradlew publishToMavenLocal` - Publish to local Maven repository for testing

**Note:** The Gradle wrapper (gradlew) is fully functional and updated to version 8.11.1.

## Architecture

**Package Structure:**
- `com.cerrorism.kassert.basic` - Core assertions (equality, nullability, boolean, referential equality, subtypes)
- `com.cerrorism.kassert.collection` - Collection and array assertions including primitive array support
- `com.cerrorism.kassert.numerical` - Numeric comparisons, ranges, positive/negative checks
- `com.cerrorism.kassert.string` - String assertions (empty, regex, case-insensitive, CharSequence)
- `com.cerrorism.kassert.exception` - Exception testing utilities
- `com.cerrorism.kassert.util` - Internal utilities (failure descriptions)

**Key Design Patterns:**
1. **Infix Functions**: All assertions use infix notation for readability (e.g., `value \`should be equal to\` expected`)
2. **Extension Functions**: Assertions extend the types being tested
3. **Backtick Syntax**: Uses backticks for assertion method names to create natural language descriptions
4. **Fluent Interface**: Assertions return the original object to enable chaining

**Testing Philosophy:**
- Tests serve as documentation and usage examples
- Each assertion category has comprehensive test coverage
- Test methods use descriptive names that explain the functionality
- Tests include both positive and negative cases with failure message validation

**Dependencies:**
- Kotlin standard library and kotlin-test (runtime)
- JUnit Jupiter (test framework)
- Java 21 toolchain required

## Development Notes

- All source files use `@file:Suppress("FunctionName")` for backtick method names
- The project targets JVM only (multiplatform support was removed for simplicity)
- Failure messages follow a consistent format showing expected vs actual values
- Uses Gradle version catalogs for dependency management (libs.versions.toml)