package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.writer.procedural.Primitive

class VkTypeHandle(override val name: String, val parent: String?) : VkType {


	override val primitive = Primitive.LONG

	override val shouldGen = true

	override val genName = VkGenUtils.handleShortName(name) + "H"


}