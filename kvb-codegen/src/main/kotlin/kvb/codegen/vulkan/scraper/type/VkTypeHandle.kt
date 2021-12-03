package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.dropVkAndPostfix
import kvb.codegen.writer.procedural.Primitive

class VkTypeHandle(override val name: String) : VkType {


	/**
	 * All handles are opaque pointers.
	 */
	override val primitive = Primitive.LONG

	override val shouldGen = true

	override val genName = name.dropVkAndPostfix + 'H'


}