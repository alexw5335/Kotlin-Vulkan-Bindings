package vulkan.scraper.type

import memory.Primitive

/**
 * Represents a native void pointer (void*).
 */
object VkTypeVoid : VkType {

	override val name = "void"

	override val shortName = "void"

	override val primitive = Primitive.POINTER

	override val genName = primitive.kName

	override val aliased = false

}