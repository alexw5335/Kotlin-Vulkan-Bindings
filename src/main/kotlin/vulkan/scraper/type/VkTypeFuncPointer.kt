package vulkan.scraper.type

import memory.Primitive

/**
 * A pointer to a vulkan function.
 */
data class VkTypeFuncPointer(
	override val name    : String,
	override val aliased : Boolean = false
): VkType {


	override val primitive = Primitive.POINTER

	override val genName = primitive.kName


}