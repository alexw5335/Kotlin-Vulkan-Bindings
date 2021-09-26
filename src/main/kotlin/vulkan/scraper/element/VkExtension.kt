package vulkan.scraper.element

import vulkan.scraper.list.VkTypesList

data class VkExtension(
	override val name : String,
	val type          : Type,
	val types		  : VkTypesList,
	val commands      : List<VkCommand>,
	val platform      : VkPlatform?
): VkElement {


	enum class Type {
		INSTANCE, DEVICE;
	}


}