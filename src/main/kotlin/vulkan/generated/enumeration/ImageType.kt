// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageType {
 *         _1D  = 0
 *         _2D  = 1
 *         _3D  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ImageType(val id: Int) {
	
	
	val is_1D get() = id == 0
	val is_2D get() = id == 1
	val is_3D get() = id == 2
	
	
	
	override fun toString() = when(id) {
		_1D.id -> "_1D"
		_2D.id -> "_2D"
		_3D.id -> "_3D"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val _1D get() = ImageType(0)
		val _2D get() = ImageType(1)
		val _3D get() = ImageType(2)
	
	}


}