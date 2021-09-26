// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSamplerMipmapMode {
 *         NEAREST  = 0
 *         LINEAR   = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SamplerMipmapMode(val id: Int) {
	
	
	val is_NEAREST get() = id == 0
	val is_LINEAR get() = id == 1
	
	
	
	override fun toString() = when(id) {
		NEAREST.id -> "NEAREST"
		LINEAR.id -> "LINEAR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val NEAREST get() = SamplerMipmapMode(0)
		val LINEAR get() = SamplerMipmapMode(1)
	
	}


}