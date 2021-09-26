// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceOverrideTypeINTEL {
 *         NULL_HARDWARE     = 0
 *         FLUSH_GPU_CACHES  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceOverrideType(val id: Int) {
	
	
	val is_NULL_HARDWARE get() = id == 0
	val is_FLUSH_GPU_CACHES get() = id == 1
	
	
	
	override fun toString() = when(id) {
		NULL_HARDWARE.id -> "NULL_HARDWARE"
		FLUSH_GPU_CACHES.id -> "FLUSH_GPU_CACHES"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val NULL_HARDWARE get() = PerformanceOverrideType(0)
		val FLUSH_GPU_CACHES get() = PerformanceOverrideType(1)
	
	}


}