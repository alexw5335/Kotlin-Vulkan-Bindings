// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_FUCHSIA_buffer_collection

 *     enum VkImageConstraintsInfoFlagBitsFUCHSIA {
 *         VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_RARELY_FUCHSIA     = 1
 *         VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_OFTEN_FUCHSIA      = 2
 *         VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_RARELY_FUCHSIA    = 4
 *         VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_OFTEN_FUCHSIA     = 8
 *         VK_IMAGE_CONSTRAINTS_INFO_PROTECTED_OPTIONAL_FUCHSIA  = 16
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageConstraintsInfoFlags(val value: Int) {
	
	
	companion object {
		
		val CPU_READ_RARELY = ImageConstraintsInfoFlags(1)
		
		val CPU_READ_OFTEN = ImageConstraintsInfoFlags(2)
		
		val CPU_WRITE_RARELY = ImageConstraintsInfoFlags(4)
		
		val CPU_WRITE_OFTEN = ImageConstraintsInfoFlags(8)
		
		val PROTECTED_OPTIONAL = ImageConstraintsInfoFlags(16)
	
	}
	
	
	
	operator fun plus(mask: ImageConstraintsInfoFlags) = ImageConstraintsInfoFlags(value or mask.value)
	
	operator fun contains(mask: ImageConstraintsInfoFlags) = value and mask.value == mask.value


}