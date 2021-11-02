package kvb.vkwrapper.persistent

import kvb.vulkan.MemoryHeapFlags
import kvb.vulkan.MemoryHeap

/**
 * Persistent implementation of [VkMemoryHeap][MemoryHeap].
 */
class MemoryHeapP(
	val size: Long,
	val flags: MemoryHeapFlags
) {


	constructor(struct: MemoryHeap) : this(
		struct.size,
		struct.flags
	)


}