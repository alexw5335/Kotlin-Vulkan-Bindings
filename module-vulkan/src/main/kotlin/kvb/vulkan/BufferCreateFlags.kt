// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkBufferCreateFlagBits {
 *         VK_BUFFER_CREATE_SPARSE_BINDING_BIT                     = 1
 *         VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT                   = 2
 *         VK_BUFFER_CREATE_SPARSE_ALIASED_BIT                     = 4
 *         VK_BUFFER_CREATE_PROTECTED_BIT                          = 8
 *         VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT      = 16
 *         VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT  = 16
 *         VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR  = 16
 *         VK_BUFFER_CREATE_RESERVED_5_BIT_NV                      = 32
 *     }
 */
@Suppress("unused")
@JvmInline
value class BufferCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SPARSE_BINDING = BufferCreateFlags(1)
		
		val SPARSE_RESIDENCY = BufferCreateFlags(2)
		
		val SPARSE_ALIASED = BufferCreateFlags(4)
		
		val PROTECTED = BufferCreateFlags(8)
		
		val DEVICE_ADDRESS_CAPTURE_REPLAY = BufferCreateFlags(16)
	
	}
	
	
	
	operator fun plus(mask: BufferCreateFlags) = BufferCreateFlags(value or mask.value)
	
	operator fun contains(mask: BufferCreateFlags) = value and mask.value == mask.value


}