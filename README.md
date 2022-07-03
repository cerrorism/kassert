# Kassert

![Build Status](https://github.com/cerrorism/kassert/actions/workflows/build-main.yml/badge.svg)

Kassert is an assertion library for Kotlin. It is a rewritten and
simplified version of [Kluent](https://markusamshove.github.io/Kluent/).
Like Kluent, it is using the
[Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation")
and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions")
to make the assertion more human-readable.

## Simplified from Kluent

* I removed the multiplatform support. I am only using Kotlin in JVM, so
  kassert is only focusing on JVM, making the code much easier to maintain.
* I only kept the "backtick version" of the assertion. So the statements
  in unit tests are more like a description of the functionalities.
* I removed the Junit dependency. Kassert only depends on the kotlin
  standard library and kotlin-test package.

## Maven

To use the package, you need to use the following Maven dependency:

```xml

<dependency>
    <groupId>io.github.cerrorism</groupId>
    <artifactId>kassert</artifactId>
    <version>{release-version}</version>
</dependency>
```

This library is available on both [Maven Central](https://search.maven.org/artifact/io.github.cerrorism/kassert)
and [GitHub Package](https://github.com/cerrorism/kassert/packages/1503635).

## Documentation

The unit tests of Kassert can be used as examples, which can be found under
`/src/test/kotlin` folder.
