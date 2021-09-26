// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkIndexType {
 *         UINT16   = 0
 *         UINT32   = 1
 *         NONE     = 1000165000
 *         NONE_NV  = 1000165000
 *         UINT8    = 1000265000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class IndexType(val id: Int) {
	
	
	val is_UINT16 get() = id == 0
	val is_UINT32 get() = id == 1
	val is_NONE get() = id == 1000165000
	val is_NONE_NV get() = id == 1000165000
	val is_UINT8 get() = id == 1000265000
	
	
	
	override fun toString() = when(id) {
		UINT16.id -> "UINT16"
		UINT32.id -> "UINT32"
		NONE.id -> "NONE"
		NONE_NV.id -> "NONE_NV"
		UINT8.id -> "UINT8"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val UINT16 get() = IndexType(0)
		val UINT32 get() = IndexType(1)
		val NONE get() = IndexType(1000165000)
		val NONE_NV get() = IndexType(1000165000)
		val UINT8 get() = IndexType(1000265000)
	
	}


}