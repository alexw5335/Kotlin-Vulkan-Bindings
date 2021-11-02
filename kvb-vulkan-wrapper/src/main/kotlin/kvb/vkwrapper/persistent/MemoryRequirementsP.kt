package kvb.vkwrapper.persistent

import kvb.vulkan.MemoryRequirements

/**
 * Persistent implementation of [vkMemoryRequirements][MemoryRequirements].
 */
class MemoryRequirementsP(
	val size: Long,
	val alignment: Long,
	val memoryTypeBits: Int
) {


	constructor(struct: MemoryRequirements) : this(
		struct.size,
		struct.alignment,
		struct.memoryTypeBits
	)


}