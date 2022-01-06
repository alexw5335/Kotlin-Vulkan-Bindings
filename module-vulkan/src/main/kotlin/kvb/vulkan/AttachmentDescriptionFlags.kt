// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkAttachmentDescriptionFlagBits {
 *         VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class AttachmentDescriptionFlags(val value: Int) {
	
	
	companion object {
		
		val MAY_ALIAS = AttachmentDescriptionFlags(1)
	
	}
	
	
	
	operator fun plus(mask: AttachmentDescriptionFlags) = AttachmentDescriptionFlags(value or mask.value)
	
	operator fun contains(mask: AttachmentDescriptionFlags) = value and mask.value == mask.value


}