package kvb.vkwrapper.persistent

import kvb.vulkan.enumeration.MemoryHeapFlags
import kvb.vulkan.struct.MemoryHeap

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