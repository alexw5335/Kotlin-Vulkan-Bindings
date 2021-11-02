package kvb.vkwrapper.persistent

import kvb.vulkan.enumeration.ColorSpace
import kvb.vulkan.enumeration.Format
import kvb.vulkan.struct.SurfaceFormat

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