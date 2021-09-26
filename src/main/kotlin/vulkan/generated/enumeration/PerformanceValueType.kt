// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceValueTypeINTEL {
 *         UINT32  = 0
 *         UINT64  = 1
 *         FLOAT   = 2
 *         BOOL    = 3
 *         STRING  = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceValueType(val id: Int) {
	
	
	val is_UINT32 get() = id == 0
	val is_UINT64 get() = id == 1
	val is_FLOAT get() = id == 2
	val is_BOOL get() = id == 3
	val is_STRING get() = id == 4
	
	
	
	override fun toString() = when(id) {
		UINT32.id -> "UINT32"
		UINT64.id -> "UINT64"
		FLOAT.id -> "FLOAT"
		BOOL.id -> "BOOL"
		STRING.id -> "STRING"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val UINT32 get() = PerformanceValueType(0)
		val UINT64 get() = PerformanceValueType(1)
		val FLOAT get() = PerformanceValueType(2)
		val BOOL get() = PerformanceValueType(3)
		val STRING get() = PerformanceValueType(4)
	
	}


}