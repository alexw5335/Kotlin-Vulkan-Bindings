package kvb.vkwrapper.persistent

import kvb.vulkan.struct.Extent2D

/**
 * Persistent implementation of [VkExtent2D][Extent2D].
 */
class Extent2DP(
	val width: Int,
	val height: Int
) {


	constructor(struct: Extent2D) : this(
		struct.width,
		struct.height
	)


}