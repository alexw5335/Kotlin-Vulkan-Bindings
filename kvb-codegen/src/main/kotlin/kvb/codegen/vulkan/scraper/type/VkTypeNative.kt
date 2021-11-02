package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

class VkTypeNative(override val name: String, override val primitive: Primitive) : VkType {


	override val shouldGen = true

	override val genName = primitive.kName


}