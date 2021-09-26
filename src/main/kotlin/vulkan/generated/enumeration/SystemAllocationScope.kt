// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSystemAllocationScope {
 *         COMMAND   = 0
 *         OBJECT    = 1
 *         CACHE     = 2
 *         DEVICE    = 3
 *         INSTANCE  = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SystemAllocationScope(val id: Int) {
	
	
	val is_COMMAND get() = id == 0
	val is_OBJECT get() = id == 1
	val is_CACHE get() = id == 2
	val is_DEVICE get() = id == 3
	val is_INSTANCE get() = id == 4
	
	
	
	override fun toString() = when(id) {
		COMMAND.id -> "COMMAND"
		OBJECT.id -> "OBJECT"
		CACHE.id -> "CACHE"
		DEVICE.id -> "DEVICE"
		INSTANCE.id -> "INSTANCE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val COMMAND get() = SystemAllocationScope(0)
		val OBJECT get() = SystemAllocationScope(1)
		val CACHE get() = SystemAllocationScope(2)
		val DEVICE get() = SystemAllocationScope(3)
		val INSTANCE get() = SystemAllocationScope(4)
	
	}


}