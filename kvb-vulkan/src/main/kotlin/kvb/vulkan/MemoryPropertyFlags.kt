// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkMemoryPropertyFlagBits {
 *         VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT         = 1
 *         VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT         = 2
 *         VK_MEMORY_PROPERTY_HOST_COHERENT_BIT        = 4
 *         VK_MEMORY_PROPERTY_HOST_CACHED_BIT          = 8
 *         VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT     = 16
 *         VK_MEMORY_PROPERTY_PROTECTED_BIT            = 32
 *         VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD  = 64
 *         VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD  = 128
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class MemoryPropertyFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_LOCAL = MemoryPropertyFlags(1)
		
		val HOST_VISIBLE = MemoryPropertyFlags(2)
		
		val HOST_COHERENT = MemoryPropertyFlags(4)
		
		val HOST_CACHED = MemoryPropertyFlags(8)
		
		val LAZILY_ALLOCATED = MemoryPropertyFlags(16)
		
		val PROTECTED = MemoryPropertyFlags(32)
		
		val DEVICE_COHERENT = MemoryPropertyFlags(64)
		
		val DEVICE_UNCACHED = MemoryPropertyFlags(128)
	
	}
	
	
	
	operator fun plus(mask: MemoryPropertyFlags) = MemoryPropertyFlags(value or mask.value)
	
	operator fun contains(mask: MemoryPropertyFlags) = value and mask.value == mask.value


}