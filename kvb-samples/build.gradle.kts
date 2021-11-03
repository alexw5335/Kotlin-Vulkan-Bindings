import org.jetbrains.kotlin.gradle.tasks.KotlinCompile



plugins {
	kotlin("jvm") version "1.5.31"
}



dependencies {
	implementation(project(":kvb-core"))
	implementation(project(":kvb-vulkan"))
	implementation(project(":kvb-vulkan-wrapper"))
	implementation(project(":kvb-window"))
}



tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "16"
}