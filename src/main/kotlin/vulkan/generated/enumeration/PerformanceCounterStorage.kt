// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceCounterStorageKHR {
 *         INT32    = 0
 *         INT64    = 1
 *         UINT32   = 2
 *         UINT64   = 3
 *         FLOAT32  = 4
 *         FLOAT64  = 5
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceCounterStorage(val id: Int) {
	
	
	val is_INT32 get() = id == 0
	val is_INT64 get() = id == 1
	val is_UINT32 get() = id == 2
	val is_UINT64 get() = id == 3
	val is_FLOAT32 get() = id == 4
	val is_FLOAT64 get() = id == 5
	
	
	
	override fun toString() = when(id) {
		INT32.id -> "INT32"
		INT64.id -> "INT64"
		UINT32.id -> "UINT32"
		UINT64.id -> "UINT64"
		FLOAT32.id -> "FLOAT32"
		FLOAT64.id -> "FLOAT64"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val INT32 get() = PerformanceCounterStorage(0)
		val INT64 get() = PerformanceCounterStorage(1)
		val UINT32 get() = PerformanceCounterStorage(2)
		val UINT64 get() = PerformanceCounterStorage(3)
		val FLOAT32 get() = PerformanceCounterStorage(4)
		val FLOAT64 get() = PerformanceCounterStorage(5)
	
	}


}