plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass = "org.example.app.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
