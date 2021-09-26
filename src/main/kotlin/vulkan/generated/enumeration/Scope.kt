// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkScopeNV {
 *         DEVICE        = 1
 *         WORKGROUP     = 2
 *         SUBGROUP      = 3
 *         QUEUE_FAMILY  = 5
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class Scope(val id: Int) {
	
	
	val is_DEVICE get() = id == 1
	val is_WORKGROUP get() = id == 2
	val is_SUBGROUP get() = id == 3
	val is_QUEUE_FAMILY get() = id == 5
	
	
	
	override fun toString() = when(id) {
		DEVICE.id -> "DEVICE"
		WORKGROUP.id -> "WORKGROUP"
		SUBGROUP.id -> "SUBGROUP"
		QUEUE_FAMILY.id -> "QUEUE_FAMILY"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DEVICE get() = Scope(1)
		val WORKGROUP get() = Scope(2)
		val SUBGROUP get() = Scope(3)
		val QUEUE_FAMILY get() = Scope(5)
	
	}


}