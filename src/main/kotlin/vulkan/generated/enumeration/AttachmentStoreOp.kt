// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAttachmentStoreOp {
 *         STORE      = 0
 *         DONT_CARE  = 1
 *         NONE       = 1000301000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class AttachmentStoreOp(val id: Int) {
	
	
	val is_STORE get() = id == 0
	val is_DONT_CARE get() = id == 1
	val is_NONE get() = id == 1000301000
	
	
	
	override fun toString() = when(id) {
		STORE.id -> "STORE"
		DONT_CARE.id -> "DONT_CARE"
		NONE.id -> "NONE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val STORE get() = AttachmentStoreOp(0)
		val DONT_CARE get() = AttachmentStoreOp(1)
		val NONE get() = AttachmentStoreOp(1000301000)
	
	}


}