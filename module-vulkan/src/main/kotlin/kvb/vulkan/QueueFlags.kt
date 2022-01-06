// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkQueueFlagBits {
 *         VK_QUEUE_GRAPHICS_BIT          = 1
 *         VK_QUEUE_COMPUTE_BIT           = 2
 *         VK_QUEUE_TRANSFER_BIT          = 4
 *         VK_QUEUE_SPARSE_BINDING_BIT    = 8
 *         VK_QUEUE_PROTECTED_BIT         = 16
 *         VK_QUEUE_VIDEO_DECODE_BIT_KHR  = 32
 *         VK_QUEUE_VIDEO_ENCODE_BIT_KHR  = 64
 *         VK_QUEUE_RESERVED_7_BIT_QCOM   = 128
 *     }
 */
@Suppress("unused")
@JvmInline
value class QueueFlags(val value: Int) {
	
	
	companion object {
		
		val GRAPHICS = QueueFlags(1)
		
		val COMPUTE = QueueFlags(2)
		
		val TRANSFER = QueueFlags(4)
		
		val SPARSE_BINDING = QueueFlags(8)
		
		val PROTECTED = QueueFlags(16)
		
		val VIDEO_DECODE = QueueFlags(32)
		
		val VIDEO_ENCODE = QueueFlags(64)
	
	}
	
	
	
	operator fun plus(mask: QueueFlags) = QueueFlags(value or mask.value)
	
	operator fun contains(mask: QueueFlags) = value and mask.value == mask.value


}