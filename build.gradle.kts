import org.jetbrains.kotlin.gradle.tasks.KotlinCompile



group = "untitled"
version = "1.0"



plugins {
	kotlin("jvm") version "1.6.20"
}



allprojects {
    group = project.group
    version = project.version

    repositories {
        mavenCentral()
    }

	apply {
		tasks.withType<KotlinCompile> {
			kotlinOptions.jvmTarget = "16"
		}

		plugin("org.jetbrains.kotlin.jvm")
	}
}