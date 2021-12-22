package kvb.vkwrapper.persistent

import kvb.vulkan.ColorSpace
import kvb.vulkan.Format
import kvb.vulkan.SurfaceFormat

/**
 * Persistent implementation of [VkSurfaceFormatKHR][SurfaceFormat].
 */
class SurfaceFormatP(
	val format: Format,
	val colourSpace: ColorSpace
) {


	constructor(struct: SurfaceFormat) : this(
		struct.format,
		struct.colorSpace
	)


}