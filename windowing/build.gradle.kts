import org.jetbrains.kotlin.gradle.tasks.KotlinCompile



plugins {
    kotlin("jvm") version "1.5.31"
}



dependencies {
    implementation(project(":core"))
}



tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "16"
}