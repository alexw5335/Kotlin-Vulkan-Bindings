package kvb.vkwrapper.persistent

import kvb.vulkan.LayerProperties

/**
 * Persistent implementation of [VkLayerProperties][LayerProperties]
 */
class LayerPropertiesP(
	val name                  : String,
	val specVersion           : Int,
	val implementationVersion : Int,
	val description           : String
) {


	constructor(struct: LayerProperties) : this(
		struct.layerName.decodeUtf8NT(),
		struct.specVersion,
		struct.implementationVersion,
		struct.description.decodeUtf8NT()
	)


}