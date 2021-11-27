package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

class VkTypeHandle(override val name: String) : VkType {


	override lateinit var genName: String

	override val shouldGen = true

	override val primitive = Primitive.LONG


}