package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkNamedList
import kvb.codegen.vulkan.scraper.list.VkTypeList

class VkExtension(
	override val name : String,
	val platform      : VkPlatform?,
	val deprecatedBy  : String?,
	val promotedTo    : String?,
	val disabled      : Boolean,
	val number        : Int,
) : VkProvider {


	override val types = VkTypeList()

	override val commands = VkNamedList<VkCommand>()

	override val shouldGen = deprecatedBy == null && !disabled && promotedTo != "VK_VERSION_1_1"


}