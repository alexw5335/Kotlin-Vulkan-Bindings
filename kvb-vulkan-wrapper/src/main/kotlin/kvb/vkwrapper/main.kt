package kvb.vkwrapper

import kvb.core.Platform
import kvb.core.memory.MemStacks
import kvb.vulkan.*
import kvb.vulkan.command.StandaloneCommands

fun main() {
	Platform.init()

	MemStacks.with {
		val pInstance = mallocLong()
		val instanceCI = InstanceCreateInfo { }
		val value = StandaloneCommands.createInstance(instanceCI, null, pInstance)
		println(value)
	}
}