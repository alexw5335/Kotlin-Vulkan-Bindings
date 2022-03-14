package kvb.vkwrapper.handle

import kvb.vulkan.MemoryRequirements

sealed interface VkResource {


	val memoryRequirements: MemoryRequirements

	val memory: DeviceMemory

	val offset: Long

	val size: Long

	val isBound: Boolean

	fun bindMemory(memory: DeviceMemory, offset: Long)

	fun bindMemory(memory: DeviceMemory) = bindMemory(memory, 0L)


}