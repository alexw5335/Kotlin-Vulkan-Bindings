package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

/**
 * A platform-specific type, usually an opaque struct pointer.
 */
class VkTypeNative(override val name: String, override val primitive: Primitive) : VkType {


	override val shouldGen = false

	override val genName = primitive.kName


}