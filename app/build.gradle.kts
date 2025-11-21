plugins {
    application
    id("com.github.ben-manes.versions") version "0.53.0"
    id("org.sonarqube") version "7.1.0.6387"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass = "hexlet.code.App"
    applicationDefaultJvmArgs = listOf("-Dgreeting.language=en")
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
}

sonar {
    properties {
        property("sonar.projectKey", "Elessarov1_java-project-61")
        property("sonar.organization", "elessarov1")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}