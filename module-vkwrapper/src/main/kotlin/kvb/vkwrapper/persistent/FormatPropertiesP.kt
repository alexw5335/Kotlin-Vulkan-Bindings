package kvb.vkwrapper.persistent

import kvb.vulkan.FormatFeatureFlags
import kvb.vulkan.FormatProperties

/**
 * Persistent implementation of [FormatProperties].
 */
class FormatPropertiesP(
	val linearTilingFeatures: FormatFeatureFlags,
	val optimalTilingFeatures: FormatFeatureFlags,
	val bufferFeatures: FormatFeatureFlags
) {


	constructor(struct: FormatProperties) : this(
		struct.linearTilingFeatures,
		struct.optimalTilingFeatures,
		struct.bufferFeatures
	)


}