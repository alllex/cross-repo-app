plugins {
    application
}

group = "org.example.cross.repo"
version = "0.1.0"

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.example.cross.repo:lib") // no version necessary
    
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    mainClass = "org.example.app.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
