// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkShaderGroupShaderKHR {
 *         GENERAL       = 0
 *         CLOSEST_HIT   = 1
 *         ANY_HIT       = 2
 *         INTERSECTION  = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ShaderGroupShader(val id: Int) {
	
	
	val is_GENERAL get() = id == 0
	val is_CLOSEST_HIT get() = id == 1
	val is_ANY_HIT get() = id == 2
	val is_INTERSECTION get() = id == 3
	
	
	
	override fun toString() = when(id) {
		GENERAL.id -> "GENERAL"
		CLOSEST_HIT.id -> "CLOSEST_HIT"
		ANY_HIT.id -> "ANY_HIT"
		INTERSECTION.id -> "INTERSECTION"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val GENERAL get() = ShaderGroupShader(0)
		val CLOSEST_HIT get() = ShaderGroupShader(1)
		val ANY_HIT get() = ShaderGroupShader(2)
		val INTERSECTION get() = ShaderGroupShader(3)
	
	}


}