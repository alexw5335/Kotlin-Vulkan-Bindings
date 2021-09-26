package vulkan.scraper.element

data class VkEnumEntry(
	override val name      : String,
	override val shortName : String,
	val enumValue          : String
) : VkElement