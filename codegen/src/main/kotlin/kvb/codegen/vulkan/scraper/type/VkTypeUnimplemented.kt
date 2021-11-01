package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

/**
 * Types that are not used when generating JNI code such as platforms, defines, includes. These may still be referenced
 * by other types.
 */
class VkTypeUnimplemented(override val name: String): VkType {


	override val primitive = Primitive.LONG

	override val shouldGen = true

	override val genName = primitive.kName


}