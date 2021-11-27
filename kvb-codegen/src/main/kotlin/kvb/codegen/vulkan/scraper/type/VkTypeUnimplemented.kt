package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

/**
 * Types that are not used when generating JNI code such as platforms, defines, includes. These types may be referenced
 * by other Vulkan types, but should not be explicitly used.
 */
class VkTypeUnimplemented(override val name: String): VkType {


	override var genName = name

	override val primitive = Primitive.LONG


}