// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkShaderFloatControlsIndependenceKHR {
 *         _32_BIT_ONLY      = 0
 *         ALL               = 1
 *         NONE              = 2
 *         _32_BIT_ONLY_KHR  = 0
 *         ALL_KHR           = 1
 *         NONE_KHR          = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ShaderFloatControlsIndependence(val id: Int) {
	
	
	val is_32_BIT_ONLY get() = id == 0
	val is_ALL get() = id == 1
	val is_NONE get() = id == 2
	val is_32_BIT_ONLY_KHR get() = id == 0
	val is_ALL_KHR get() = id == 1
	val is_NONE_KHR get() = id == 2
	
	
	
	override fun toString() = when(id) {
		_32_BIT_ONLY.id -> "_32_BIT_ONLY"
		ALL.id -> "ALL"
		NONE.id -> "NONE"
		_32_BIT_ONLY_KHR.id -> "_32_BIT_ONLY_KHR"
		ALL_KHR.id -> "ALL_KHR"
		NONE_KHR.id -> "NONE_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val _32_BIT_ONLY get() = ShaderFloatControlsIndependence(0)
		val ALL get() = ShaderFloatControlsIndependence(1)
		val NONE get() = ShaderFloatControlsIndependence(2)
		val _32_BIT_ONLY_KHR get() = ShaderFloatControlsIndependence(0)
		val ALL_KHR get() = ShaderFloatControlsIndependence(1)
		val NONE_KHR get() = ShaderFloatControlsIndependence(2)
	
	}


}