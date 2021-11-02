// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkMemoryAllocateFlagBits {
 *         VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT                        = 1
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT                     = 2
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT      = 4
 *         VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR                    = 1
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR                 = 2
 *         VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class MemoryAllocateFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_MASK = MemoryAllocateFlags(1)
		
		val DEVICE_ADDRESS = MemoryAllocateFlags(2)
		
		val DEVICE_ADDRESS_CAPTURE_REPLAY = MemoryAllocateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: MemoryAllocateFlags) = MemoryAllocateFlags(value or mask.value)
	
	operator fun contains(mask: MemoryAllocateFlags) = value and mask.value == mask.value


}