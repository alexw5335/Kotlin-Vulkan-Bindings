package kvb.vkwrapper.persistent

import kvb.vulkan.ExtensionProperties

/**
 * Persistent implementation of [VkExtensionProperties][ExtensionProperties]
 */
class ExtensionPropertiesP(
	val name         : String,
	val specVersion  : Int
) {


	constructor(struct: ExtensionProperties) : this(
		struct.extensionName.decodeUtf8NT(),
		struct.specVersion
	)


}