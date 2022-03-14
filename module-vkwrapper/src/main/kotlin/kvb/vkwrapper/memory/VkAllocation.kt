package kvb.vkwrapper.memory

import kvb.vkwrapper.handle.DeviceMemory

class VkAllocation(
	val memory: DeviceMemory,
	val offset: Long,
	val size: Long
)