package kvb.vkwrapper.persistent

import kvb.vulkan.enumeration.ImageAspectFlags
import kvb.vulkan.struct.ImageSubresource

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