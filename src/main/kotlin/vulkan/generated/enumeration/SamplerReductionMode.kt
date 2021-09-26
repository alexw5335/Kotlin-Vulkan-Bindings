// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSamplerReductionModeEXT {
 *         WEIGHTED_AVERAGE      = 0
 *         MIN                   = 1
 *         MAX                   = 2
 *         WEIGHTED_AVERAGE_EXT  = 0
 *         MIN_EXT               = 1
 *         MAX_EXT               = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SamplerReductionMode(val id: Int) {
	
	
	val is_WEIGHTED_AVERAGE get() = id == 0
	val is_MIN get() = id == 1
	val is_MAX get() = id == 2
	val is_WEIGHTED_AVERAGE_EXT get() = id == 0
	val is_MIN_EXT get() = id == 1
	val is_MAX_EXT get() = id == 2
	
	
	
	override fun toString() = when(id) {
		WEIGHTED_AVERAGE.id -> "WEIGHTED_AVERAGE"
		MIN.id -> "MIN"
		MAX.id -> "MAX"
		WEIGHTED_AVERAGE_EXT.id -> "WEIGHTED_AVERAGE_EXT"
		MIN_EXT.id -> "MIN_EXT"
		MAX_EXT.id -> "MAX_EXT"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val WEIGHTED_AVERAGE get() = SamplerReductionMode(0)
		val MIN get() = SamplerReductionMode(1)
		val MAX get() = SamplerReductionMode(2)
		val WEIGHTED_AVERAGE_EXT get() = SamplerReductionMode(0)
		val MIN_EXT get() = SamplerReductionMode(1)
		val MAX_EXT get() = SamplerReductionMode(2)
	
	}


}