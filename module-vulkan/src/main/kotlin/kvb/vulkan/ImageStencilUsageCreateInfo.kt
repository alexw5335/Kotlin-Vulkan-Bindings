// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkImageStencilUsageCreateInfo {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkImageUsageFlags  stencilUsage
 *     }
 */
@JvmInline
value class ImageStencilUsageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stencilUsage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}