// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSubpassContents {
 *         INLINE                     = 0
 *         SECONDARY_COMMAND_BUFFERS  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SubpassContents(val id: Int) {
	
	
	val is_INLINE get() = id == 0
	val is_SECONDARY_COMMAND_BUFFERS get() = id == 1
	
	
	
	override fun toString() = when(id) {
		INLINE.id -> "INLINE"
		SECONDARY_COMMAND_BUFFERS.id -> "SECONDARY_COMMAND_BUFFERS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val INLINE get() = SubpassContents(0)
		val SECONDARY_COMMAND_BUFFERS get() = SubpassContents(1)
	
	}


}