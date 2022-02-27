package kvb.engine

import kvb.core.Platforms
import kvb.core.memory.Unsafe
import kvb.core.memory.stackGet
import kvb.vkwrapper.VulkanBuilder
import kvb.vulkan.DeviceCreateInfo
import kvb.vulkan.DeviceH
import kvb.vulkan.DeviceQueueCreateInfo
import kvb.vulkan.check

fun main() {
	Platforms.init()

	val builder = VulkanBuilder.build {
		debugEnabled = true
	}

	val device = builder.device
	val fence = device.createSignalledFence()
	fence.waitFor(0)
	//fence.waitFor(100_000)
}