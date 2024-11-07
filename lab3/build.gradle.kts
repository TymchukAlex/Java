plugins {
    kotlin("jvm") version "1.8.10" // Add Kotlin plugin if you are using Kotlin DSL
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.15.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.15.0")
}

// Set UTF-8 encoding for Java compile tasks
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}
