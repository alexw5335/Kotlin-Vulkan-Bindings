package kvb.vkwrapper.persistent

import kvb.vulkan.ImageAspectFlags
import kvb.vulkan.ImageSubresourceRange

/**
 * Persistent implementation of [vkImageSubresourceRange][ImageSubresourceRange].
 */
class ImageSubresourceRangeP(
	val aspectMask      : ImageAspectFlags,
	val baseMipLevel    : Int,
	val mipLevelCount   : Int,
	val baseArrayLayer  : Int,
	val arrayLayerCount : Int
) {


	constructor(struct: ImageSubresourceRange) : this(
		struct.aspectMask,
		struct.baseMipLevel,
		struct.levelCount,
		struct.baseArrayLayer,
		struct.layerCount
	)


}