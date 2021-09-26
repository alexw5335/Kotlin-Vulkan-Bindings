// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkInternalAllocationType {
 *         EXECUTABLE  = 0
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class InternalAllocationType(val id: Int) {
	
	
	val is_EXECUTABLE get() = id == 0
	
	
	
	override fun toString() = when(id) {
		EXECUTABLE.id -> "EXECUTABLE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val EXECUTABLE get() = InternalAllocationType(0)
	
	}


}