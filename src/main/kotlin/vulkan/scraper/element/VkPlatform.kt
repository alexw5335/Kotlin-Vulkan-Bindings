package vulkan.scraper.element

data class VkPlatform(
	override val name : String,
	val define        : String
): VkElement