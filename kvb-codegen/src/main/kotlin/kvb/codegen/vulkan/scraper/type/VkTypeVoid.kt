package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

/**
 * Represents a native void pointer (void*).
 */
object VkTypeVoid : VkType {


	override val name = "void"

	override val primitive = Primitive.LONG


}