package kvb.engine

import kvb.core.Platform
import kvb.core.Platforms
import kvb.engine.vulkan.VulkanBuilder
import kvb.vkwrapper.Vulkan

fun main() {
	Platforms.init()

	val builder = VulkanBuilder.build {
		debugEnabled = true
	}

	val instance = builder.instance

	println(Vulkan.version)
}