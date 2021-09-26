// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCoarseSampleOrderTypeNV {
 *         DEFAULT       = 0
 *         CUSTOM        = 1
 *         PIXEL_MAJOR   = 2
 *         SAMPLE_MAJOR  = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class CoarseSampleOrderType(val id: Int) {
	
	
	val is_DEFAULT get() = id == 0
	val is_CUSTOM get() = id == 1
	val is_PIXEL_MAJOR get() = id == 2
	val is_SAMPLE_MAJOR get() = id == 3
	
	
	
	override fun toString() = when(id) {
		DEFAULT.id -> "DEFAULT"
		CUSTOM.id -> "CUSTOM"
		PIXEL_MAJOR.id -> "PIXEL_MAJOR"
		SAMPLE_MAJOR.id -> "SAMPLE_MAJOR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DEFAULT get() = CoarseSampleOrderType(0)
		val CUSTOM get() = CoarseSampleOrderType(1)
		val PIXEL_MAJOR get() = CoarseSampleOrderType(2)
		val SAMPLE_MAJOR get() = CoarseSampleOrderType(3)
	
	}


}