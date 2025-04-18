plugins {
    kotlin("jvm") version "2.1.20"
    `maven-publish`
    signing
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    withJavadocJar()
    withSourcesJar()
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("test"))
    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("kassertLib") {
            groupId = "io.github.cerrorism"
            artifactId = "kassert"
            version = System.getenv("GITHUB_REF_NAME")

            pom {
                name.set("Kassert Library")
                description.set("A Kotlin Assertion Library")
                url.set("https://github.com/cerrorism/kassert")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://github.com/cerrorism/kassert/blob/main/LICENSE")
                    }
                }
                developers {
                    developer {
                        id.set("cerrorism")
                        name.set("Zhengguang Chen")
                        email.set("cerrorism@gmail.com")
                    }
                }
                scm {
                    url.set("https://github.com/cerrorism/kassert.git")
                }
            }

            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "OSSRH"
            url = uri("https://ossrh-staging-api.central.sonatype.com/service/local/staging/deploy/maven2/")
            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/cerrorism/kassert")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

signing {
    val keyId = System.getenv("SIGNING_KEY_ID")
    val key = System.getenv("SIGNING_KEY")
    val password = System.getenv("SIGNING_KEY_PASSWORD")
    useInMemoryPgpKeys(keyId, key, password)
    sign(publishing.publications["kassertLib"])
}

