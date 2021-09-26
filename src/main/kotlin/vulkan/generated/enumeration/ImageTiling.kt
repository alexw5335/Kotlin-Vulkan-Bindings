// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageTiling {
 *         OPTIMAL              = 0
 *         LINEAR               = 1
 *         DRM_FORMAT_MODIFIER  = 1000158000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ImageTiling(val id: Int) {
	
	
	val is_OPTIMAL get() = id == 0
	val is_LINEAR get() = id == 1
	val is_DRM_FORMAT_MODIFIER get() = id == 1000158000
	
	
	
	override fun toString() = when(id) {
		OPTIMAL.id -> "OPTIMAL"
		LINEAR.id -> "LINEAR"
		DRM_FORMAT_MODIFIER.id -> "DRM_FORMAT_MODIFIER"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val OPTIMAL get() = ImageTiling(0)
		val LINEAR get() = ImageTiling(1)
		val DRM_FORMAT_MODIFIER get() = ImageTiling(1000158000)
	
	}


}