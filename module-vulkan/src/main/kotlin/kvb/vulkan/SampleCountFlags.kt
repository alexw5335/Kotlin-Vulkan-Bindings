// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSampleCountFlagBits {
 *         VK_SAMPLE_COUNT_1_BIT   = 1
 *         VK_SAMPLE_COUNT_2_BIT   = 2
 *         VK_SAMPLE_COUNT_4_BIT   = 4
 *         VK_SAMPLE_COUNT_8_BIT   = 8
 *         VK_SAMPLE_COUNT_16_BIT  = 16
 *         VK_SAMPLE_COUNT_32_BIT  = 32
 *         VK_SAMPLE_COUNT_64_BIT  = 64
 *     }
 */
@Suppress("unused")
@JvmInline
value class SampleCountFlags(val value: Int) {
	
	
	companion object {
		
		val _1 = SampleCountFlags(1)
		
		val _2 = SampleCountFlags(2)
		
		val _4 = SampleCountFlags(4)
		
		val _8 = SampleCountFlags(8)
		
		val _16 = SampleCountFlags(16)
		
		val _32 = SampleCountFlags(32)
		
		val _64 = SampleCountFlags(64)
	
	}
	
	
	
	operator fun plus(mask: SampleCountFlags) = SampleCountFlags(value or mask.value)
	
	operator fun contains(mask: SampleCountFlags) = value and mask.value == mask.value


}