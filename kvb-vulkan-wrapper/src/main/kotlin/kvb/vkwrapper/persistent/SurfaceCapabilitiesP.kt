package kvb.vkwrapper.persistent

import kvb.vulkan.CompositeAlphaFlags
import kvb.vulkan.ImageUsageFlags
import kvb.vulkan.SurfaceTransformFlags
import kvb.vulkan.SurfaceCapabilities

/**
 * Persistent implementation of [VkSurfaceCapabilitiesKHR][SurfaceCapabilities].
 */
class SurfaceCapabilitiesP(
	val minImageCount: Int,
	val maxImageCount: Int,
	val currentExtent: Extent2DP,
	val minImageExtent: Extent2DP,
	val maxImageExtent: Extent2DP,
	val maxImageArrayLayers: Int,
	val supportedTransforms: SurfaceTransformFlags,
	val currentTransform: SurfaceTransformFlags,
	val supportedCompositeAlpha: CompositeAlphaFlags,
	val supportedUsageFlags: ImageUsageFlags,
) {


	constructor(struct: SurfaceCapabilities) : this(
		struct.minImageCount,
		struct.maxImageCount,
		Extent2DP(struct.currentExtent),
		Extent2DP(struct.minImageExtent),
		Extent2DP(struct.maxImageExtent),
		struct.maxImageArrayLayers,
		struct.supportedTransforms,
		struct.currentTransform,
		struct.supportedCompositeAlpha,
		struct.supportedUsageFlags
	)


}