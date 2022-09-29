import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.DetektCreateBaselineTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version 1.7.20
    id("io.gitlab.arturbosch.detekt").version(Kotlin.deteKtVersion)
    jacoco
    `maven-publish`
    signing
}

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("test"))

    testImplementation(platform("org.junit:junit-bom:${Junit.version}"))

    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = Jvm.version
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

jacoco {
    toolVersion = Jvm.jacocoVersion
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        csv.required.set(false)
    }
}

java {
    withJavadocJar()
    withSourcesJar()
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
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
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

tasks.withType<Detekt>().configureEach {
    reports {
        sarif.required.set(true)
    }
    jvmTarget = Jvm.version
}
tasks.withType<DetektCreateBaselineTask>().configureEach {
    jvmTarget = Jvm.version
}

detekt {
    buildUponDefaultConfig = true
    config = files("$rootDir/detekt.yaml")
}

