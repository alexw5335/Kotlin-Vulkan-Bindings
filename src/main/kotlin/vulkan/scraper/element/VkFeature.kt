package vulkan.scraper.element

import vulkan.scraper.list.VkTypesList

data class VkFeature(
	override val name : String,
	val types         : VkTypesList,
	val commands      : List<VkCommand>
): VkElement