package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.writer.procedural.Primitive

/**
 * Types that are not used when generating JNI code such as platforms, defines, includes. These types may be referenced
 * by other Vulkan types, but should not be explicitly used.
 */
class VkTypeUnimplemented(override val name: String): VkType {


	override val shortName = name

	override val primitive = Primitive.LONG

	override lateinit var provider: VkProvider


}