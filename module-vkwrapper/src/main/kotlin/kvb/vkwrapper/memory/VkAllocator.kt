package kvb.vkwrapper.memory

import kvb.core.memory.*
import kvb.vkwrapper.handle.Buffer
import kvb.vkwrapper.handle.DeviceMemory
import kvb.vkwrapper.handle.Image
import kvb.vkwrapper.handle.VkResource
import kvb.vulkan.*

interface VkAllocator {


	fun allocate(size: Long, alignment: Long): VkAllocation

	fun destroy()

	fun allocate(resource: VkResource) {
		val allocation = allocate(resource.size, resource.memoryRequirements.alignment)
		resource.bindMemory(allocation.memory, allocation.offset)
	}


}