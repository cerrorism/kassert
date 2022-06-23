plugins {
    kotlin("jvm") version Kotlin.version
    jacoco
}

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

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = Jvm.version
}

jacoco {
    toolVersion = "0.8.8"
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        csv.required.set(false)
    }
}