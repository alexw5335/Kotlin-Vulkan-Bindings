// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFragmentShadingRateTypeNV {
 *         FRAGMENT_SIZE  = 0
 *         ENUMS          = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class FragmentShadingRateType(val id: Int) {
	
	
	val is_FRAGMENT_SIZE get() = id == 0
	val is_ENUMS get() = id == 1
	
	
	
	override fun toString() = when(id) {
		FRAGMENT_SIZE.id -> "FRAGMENT_SIZE"
		ENUMS.id -> "ENUMS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val FRAGMENT_SIZE get() = FragmentShadingRateType(0)
		val ENUMS get() = FragmentShadingRateType(1)
	
	}


}