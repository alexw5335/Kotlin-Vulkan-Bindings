package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.NamedList
import kvb.codegen.vulkan.scraper.list.TypeList

class VkExtension(
	override val name : String,
	val platform      : VkPlatform?,
	val deprecatedBy  : String?,
	val promotedTo    : String?,
	val disabled      : Boolean,
	val number        : Int,
) : VkProvider {


	override val types = TypeList()

	override val commands = NamedList<VkCommand>()

	override val shouldGen = deprecatedBy == null && !disabled && promotedTo != "VK_VERSION_1_1"


}