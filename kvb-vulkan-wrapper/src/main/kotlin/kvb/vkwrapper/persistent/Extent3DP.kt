package kvb.vkwrapper.persistent

import kvb.vulkan.struct.Extent3D

/**
 * Persistent implementation of [VkExtent3D][Extent3D].
 */
class Extent3DP(
	val width: Int,
	val height: Int,
	val depth: Int
) {


	constructor(struct: Extent3D) : this(
		struct.width,
		struct.height,
		struct.depth
	)


}