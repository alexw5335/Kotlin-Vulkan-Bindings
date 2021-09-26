// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDescriptorUpdateTemplateTypeKHR {
 *         DESCRIPTOR_SET      = 0
 *         PUSH_DESCRIPTORS    = 1
 *         DESCRIPTOR_SET_KHR  = 0
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DescriptorUpdateTemplateType(val id: Int) {
	
	
	val is_DESCRIPTOR_SET get() = id == 0
	val is_PUSH_DESCRIPTORS get() = id == 1
	val is_DESCRIPTOR_SET_KHR get() = id == 0
	
	
	
	override fun toString() = when(id) {
		DESCRIPTOR_SET.id -> "DESCRIPTOR_SET"
		PUSH_DESCRIPTORS.id -> "PUSH_DESCRIPTORS"
		DESCRIPTOR_SET_KHR.id -> "DESCRIPTOR_SET_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DESCRIPTOR_SET get() = DescriptorUpdateTemplateType(0)
		val PUSH_DESCRIPTORS get() = DescriptorUpdateTemplateType(1)
		val DESCRIPTOR_SET_KHR get() = DescriptorUpdateTemplateType(0)
	
	}


}