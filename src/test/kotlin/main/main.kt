package main

import memory.allocation.MemStacks
import vulkan.wrapper.Version
import vulkan.wrapper.Vulkan
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
		MemStacks.default
	)
}