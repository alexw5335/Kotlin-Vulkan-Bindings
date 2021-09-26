// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAttachmentLoadOp {
 *         LOAD       = 0
 *         CLEAR      = 1
 *         DONT_CARE  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class AttachmentLoadOp(val id: Int) {
	
	
	val is_LOAD get() = id == 0
	val is_CLEAR get() = id == 1
	val is_DONT_CARE get() = id == 2
	
	
	
	override fun toString() = when(id) {
		LOAD.id -> "LOAD"
		CLEAR.id -> "CLEAR"
		DONT_CARE.id -> "DONT_CARE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val LOAD get() = AttachmentLoadOp(0)
		val CLEAR get() = AttachmentLoadOp(1)
		val DONT_CARE get() = AttachmentLoadOp(2)
	
	}


}