package vulkan.scraper.type

import memory.Primitive

/**
 * Types that are not used when generating JNI code such as platforms, defines, includes. These may still be referenced
 * by other types.
 */
data class VkTypeUnimplemented(
	override val name    : String,
	override val aliased : Boolean = false
): VkType {


	override val primitive = Primitive.POINTER

	override val genName = primitive.kName


}