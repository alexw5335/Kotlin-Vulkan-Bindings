// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkMemoryHeapFlagBits {
 *         VK_MEMORY_HEAP_DEVICE_LOCAL_BIT        = 1
 *         VK_MEMORY_HEAP_MULTI_INSTANCE_BIT      = 2
 *         VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR  = 2
 *         VK_MEMORY_HEAP_RESERVED_2_BIT_KHR      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class MemoryHeapFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_LOCAL = MemoryHeapFlags(1)
		
		val MULTI_INSTANCE = MemoryHeapFlags(2)
	
	}
	
	
	
	operator fun plus(mask: MemoryHeapFlags) = MemoryHeapFlags(value or mask.value)
	
	operator fun contains(mask: MemoryHeapFlags) = value and mask.value == mask.value


}