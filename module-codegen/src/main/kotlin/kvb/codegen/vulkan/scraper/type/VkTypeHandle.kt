package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.GenUtils.dropVkAndPostfix
import kvb.codegen.writer.procedural.Primitive

class VkTypeHandle(override val name: String) : VkType {


	override val primitive = Primitive.LONG

	override val shouldGen = true

	override val genName = name.dropVkAndPostfix + 'H'


}