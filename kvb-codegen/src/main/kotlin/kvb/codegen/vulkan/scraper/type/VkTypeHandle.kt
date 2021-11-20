package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.writer.procedural.Primitive

class VkTypeHandle(override val name: String, val parent: String?) : VkType {


	override val shortName = VkGenUtils.handleShortName(name)

	override val primitive = Primitive.LONG

	override lateinit var provider: VkProvider


}