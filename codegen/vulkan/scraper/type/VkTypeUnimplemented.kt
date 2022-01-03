package kvb.codegen.vulkan.scraper.type

/**
 * Types that are not used when generating JNI code such as platforms, defines, includes. These types may be referenced
 * by other Vulkan types, but should not be explicitly used.
 */
class VkTypeUnimplemented(override val name: String): VkType {


	override val shouldGen = false

	override val genName = primitive.kName


}