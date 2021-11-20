package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.writer.procedural.Primitive

/**
 * Represents a native void pointer (void*).
 */
object VkTypeVoid : VkType {


	override val name = "void"

	override val shortName = name

	override val primitive = Primitive.LONG

	override lateinit var provider: VkProvider


}