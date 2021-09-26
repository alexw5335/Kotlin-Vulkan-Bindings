// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkMemoryOverallocationBehaviorAMD {
 *         DEFAULT     = 0
 *         ALLOWED     = 1
 *         DISALLOWED  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class MemoryOverallocationBehavior(val id: Int) {
	
	
	val is_DEFAULT get() = id == 0
	val is_ALLOWED get() = id == 1
	val is_DISALLOWED get() = id == 2
	
	
	
	override fun toString() = when(id) {
		DEFAULT.id -> "DEFAULT"
		ALLOWED.id -> "ALLOWED"
		DISALLOWED.id -> "DISALLOWED"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DEFAULT get() = MemoryOverallocationBehavior(0)
		val ALLOWED get() = MemoryOverallocationBehavior(1)
		val DISALLOWED get() = MemoryOverallocationBehavior(2)
	
	}


}