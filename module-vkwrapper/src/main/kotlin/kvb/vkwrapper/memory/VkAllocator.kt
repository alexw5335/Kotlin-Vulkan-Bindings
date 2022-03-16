package kvb.vkwrapper.memory

import kvb.vkwrapper.handle.VkResource

interface VkAllocator {


	fun allocate(size: Long, alignment: Long): VkAllocation

	fun destroy()

	fun allocate(resource: VkResource) {
		val allocation = allocate(resource.size, resource.alignment)
		resource.bindMemory(allocation.memory, allocation.offset)
	}


}