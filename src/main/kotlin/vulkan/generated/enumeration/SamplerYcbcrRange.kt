// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSamplerYcbcrRangeKHR {
 *         ITU_FULL        = 0
 *         ITU_NARROW      = 1
 *         ITU_FULL_KHR    = 0
 *         ITU_NARROW_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SamplerYcbcrRange(val id: Int) {
	
	
	val is_ITU_FULL get() = id == 0
	val is_ITU_NARROW get() = id == 1
	val is_ITU_FULL_KHR get() = id == 0
	val is_ITU_NARROW_KHR get() = id == 1
	
	
	
	override fun toString() = when(id) {
		ITU_FULL.id -> "ITU_FULL"
		ITU_NARROW.id -> "ITU_NARROW"
		ITU_FULL_KHR.id -> "ITU_FULL_KHR"
		ITU_NARROW_KHR.id -> "ITU_NARROW_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ITU_FULL get() = SamplerYcbcrRange(0)
		val ITU_NARROW get() = SamplerYcbcrRange(1)
		val ITU_FULL_KHR get() = SamplerYcbcrRange(0)
		val ITU_NARROW_KHR get() = SamplerYcbcrRange(1)
	
	}


}