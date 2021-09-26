// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkRasterizationOrderAMD {
 *         STRICT   = 0
 *         RELAXED  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class RasterizationOrder(val id: Int) {
	
	
	val is_STRICT get() = id == 0
	val is_RELAXED get() = id == 1
	
	
	
	override fun toString() = when(id) {
		STRICT.id -> "STRICT"
		RELAXED.id -> "RELAXED"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val STRICT get() = RasterizationOrder(0)
		val RELAXED get() = RasterizationOrder(1)
	
	}


}