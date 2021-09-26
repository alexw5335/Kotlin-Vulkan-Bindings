// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkComponentTypeNV {
 *         FLOAT16  = 0
 *         FLOAT32  = 1
 *         FLOAT64  = 2
 *         SINT8    = 3
 *         SINT16   = 4
 *         SINT32   = 5
 *         SINT64   = 6
 *         UINT8    = 7
 *         UINT16   = 8
 *         UINT32   = 9
 *         UINT64   = 10
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ComponentType(val id: Int) {
	
	
	val is_FLOAT16 get() = id == 0
	val is_FLOAT32 get() = id == 1
	val is_FLOAT64 get() = id == 2
	val is_SINT8 get() = id == 3
	val is_SINT16 get() = id == 4
	val is_SINT32 get() = id == 5
	val is_SINT64 get() = id == 6
	val is_UINT8 get() = id == 7
	val is_UINT16 get() = id == 8
	val is_UINT32 get() = id == 9
	val is_UINT64 get() = id == 10
	
	
	
	override fun toString() = when(id) {
		FLOAT16.id -> "FLOAT16"
		FLOAT32.id -> "FLOAT32"
		FLOAT64.id -> "FLOAT64"
		SINT8.id -> "SINT8"
		SINT16.id -> "SINT16"
		SINT32.id -> "SINT32"
		SINT64.id -> "SINT64"
		UINT8.id -> "UINT8"
		UINT16.id -> "UINT16"
		UINT32.id -> "UINT32"
		UINT64.id -> "UINT64"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val FLOAT16 get() = ComponentType(0)
		val FLOAT32 get() = ComponentType(1)
		val FLOAT64 get() = ComponentType(2)
		val SINT8 get() = ComponentType(3)
		val SINT16 get() = ComponentType(4)
		val SINT32 get() = ComponentType(5)
		val SINT64 get() = ComponentType(6)
		val UINT8 get() = ComponentType(7)
		val UINT16 get() = ComponentType(8)
		val UINT32 get() = ComponentType(9)
		val UINT64 get() = ComponentType(10)
	
	}


}