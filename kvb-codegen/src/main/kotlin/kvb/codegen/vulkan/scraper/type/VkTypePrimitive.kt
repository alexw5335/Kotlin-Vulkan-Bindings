package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.writer.procedural.Primitive

class VkTypePrimitive(override val name: String, override val primitive: Primitive): VkType {


	override val shortName = name

	override lateinit var provider: VkProvider


}