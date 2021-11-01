package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

/**
 * A C function pointer to a vulkan function.
 */
class VkTypeFuncPointer(override val name: String): VkType {


	override val primitive = Primitive.LONG

	override val shouldGen = true

	override val genName = primitive.kName


}