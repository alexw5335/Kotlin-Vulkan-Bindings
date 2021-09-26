package vulkan.scraper.type

import memory.Primitive

data class VkTypePrimitive(
	override val name      : String,
	override val primitive : Primitive,
	override val aliased   : Boolean = false
): VkType {


	override val genName = primitive.kName


}