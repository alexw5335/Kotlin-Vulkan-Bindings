// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDeviceMemoryReportEventTypeEXT {
 *         ALLOCATE           = 0
 *         FREE               = 1
 *         IMPORT             = 2
 *         UNIMPORT           = 3
 *         ALLOCATION_FAILED  = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DeviceMemoryReportEventType(val id: Int) {
	
	
	val is_ALLOCATE get() = id == 0
	val is_FREE get() = id == 1
	val is_IMPORT get() = id == 2
	val is_UNIMPORT get() = id == 3
	val is_ALLOCATION_FAILED get() = id == 4
	
	
	
	override fun toString() = when(id) {
		ALLOCATE.id -> "ALLOCATE"
		FREE.id -> "FREE"
		IMPORT.id -> "IMPORT"
		UNIMPORT.id -> "UNIMPORT"
		ALLOCATION_FAILED.id -> "ALLOCATION_FAILED"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ALLOCATE get() = DeviceMemoryReportEventType(0)
		val FREE get() = DeviceMemoryReportEventType(1)
		val IMPORT get() = DeviceMemoryReportEventType(2)
		val UNIMPORT get() = DeviceMemoryReportEventType(3)
		val ALLOCATION_FAILED get() = DeviceMemoryReportEventType(4)
	
	}


}