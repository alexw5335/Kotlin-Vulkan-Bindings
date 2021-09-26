// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCommandBufferLevel {
 *         PRIMARY    = 0
 *         SECONDARY  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class CommandBufferLevel(val id: Int) {
	
	
	val is_PRIMARY get() = id == 0
	val is_SECONDARY get() = id == 1
	
	
	
	override fun toString() = when(id) {
		PRIMARY.id -> "PRIMARY"
		SECONDARY.id -> "SECONDARY"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val PRIMARY get() = CommandBufferLevel(0)
		val SECONDARY get() = CommandBufferLevel(1)
	
	}


}