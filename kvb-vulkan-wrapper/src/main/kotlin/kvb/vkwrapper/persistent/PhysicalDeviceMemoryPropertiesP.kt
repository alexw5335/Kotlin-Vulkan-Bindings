package kvb.vkwrapper.persistent

import kvb.vulkan.struct.PhysicalDeviceMemoryProperties

/**
 * Persistent implementation of [VkPhysicalDeviceMemoryProperties][PhysicalDeviceMemoryProperties].
 */
class PhysicalDeviceMemoryPropertiesP(
	val memoryTypes: List<MemoryTypeP>,
	val memoryHeaps: List<MemoryHeapP>,
) {


	constructor(struct: PhysicalDeviceMemoryProperties): this(
		List(struct.memoryTypeCount) { MemoryTypeP(struct.memoryTypes[it], it, struct.memoryHeaps) },
		List(struct.memoryHeapCount) { MemoryHeapP(struct.memoryHeaps[it]) }
	)


}