// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageViewType {
 *         _1D         = 0
 *         _2D         = 1
 *         _3D         = 2
 *         CUBE        = 3
 *         _1D_ARRAY   = 4
 *         _2D_ARRAY   = 5
 *         CUBE_ARRAY  = 6
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ImageViewType(val id: Int) {
	
	
	val is_1D get() = id == 0
	val is_2D get() = id == 1
	val is_3D get() = id == 2
	val is_CUBE get() = id == 3
	val is_1D_ARRAY get() = id == 4
	val is_2D_ARRAY get() = id == 5
	val is_CUBE_ARRAY get() = id == 6
	
	
	
	override fun toString() = when(id) {
		_1D.id -> "_1D"
		_2D.id -> "_2D"
		_3D.id -> "_3D"
		CUBE.id -> "CUBE"
		_1D_ARRAY.id -> "_1D_ARRAY"
		_2D_ARRAY.id -> "_2D_ARRAY"
		CUBE_ARRAY.id -> "CUBE_ARRAY"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val _1D get() = ImageViewType(0)
		val _2D get() = ImageViewType(1)
		val _3D get() = ImageViewType(2)
		val CUBE get() = ImageViewType(3)
		val _1D_ARRAY get() = ImageViewType(4)
		val _2D_ARRAY get() = ImageViewType(5)
		val CUBE_ARRAY get() = ImageViewType(6)
	
	}


}