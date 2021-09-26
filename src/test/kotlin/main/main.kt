package main

import memory.Unsafe
import memory.allocation.MemStack
import memory.allocation.MemStacks
import vulkan.generated.allocation.ApplicationInfo
import vulkan.generated.allocation.InstanceCreateInfo
import vulkan.generated.command.StandaloneCommands
import vulkan.generation.VkGenerator
import vulkan.wrapper.Version
import vulkan.wrapper.Vulkan
import vulkan.wrapper.Vulkan.check
import java.nio.file.Paths



private fun loadWindows(name: String) {
	System.load(Paths.get("natives/windows/$name.dll").toAbsolutePath().toString())
}



fun main() {
	loadWindows("native_sizes")
	loadWindows("commands")

	val instance = Vulkan.createInstance(
		applicationName       = "My application",
		applicationVersion    = Version(1, 0, 0),
		engineName            = "My engine",
		engineVersion         = Version(1, 0, 0),
		apiVersion            = Version(1, 2, 0),
		enabledLayerNames     = listOf("VK_LAYER_KHRONOS_validation"),
		enabledExtensionNames = listOf("VK_KHR_surface", "VK_KHR_win32_surface", "VK_EXT_debug_utils"),
	)
}