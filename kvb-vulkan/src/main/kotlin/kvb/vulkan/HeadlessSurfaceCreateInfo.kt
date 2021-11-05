// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkHeadlessSurfaceCreateInfoEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkHeadlessSurfaceCreateFlagsEXT  flags (reserved, must be zero)
 *     }
 */
@JvmInline
value class HeadlessSurfaceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}