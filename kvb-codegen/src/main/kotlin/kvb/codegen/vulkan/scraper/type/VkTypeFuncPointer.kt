package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.writer.procedural.Primitive

/**
 * A C function pointer to a vulkan function.
 */
class VkTypeFuncPointer(override val name: String): VkType {


	override val shortName = name

	override val primitive = Primitive.LONG

	override lateinit var provider: VkProvider


}