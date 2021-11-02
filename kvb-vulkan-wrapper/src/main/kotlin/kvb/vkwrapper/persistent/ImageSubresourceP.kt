package kvb.vkwrapper.persistent

import kvb.vulkan.ImageAspectFlags
import kvb.vulkan.ImageSubresource

/**
 * Persistent implementation of [vkImageSubresource][ImageSubresource].
 */
class ImageSubresourceP(
	val aspectMask : ImageAspectFlags,
	val mipLevel   : Int,
	val arrayLayer : Int
) {


	constructor(struct: ImageSubresource) : this(
		struct.aspectMask,
		struct.mipLevel,
		struct.arrayLayer
	)


}