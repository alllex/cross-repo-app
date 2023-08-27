plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "cross-repo-app"

includeBuild("cross-repo-lib") {
    dependencySubstitution {
        substitute(module("org.example.cross.repo:lib")).using(project(":lib"))
    }
}

include("app")
