// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageMemoryRequirementsInfo2 {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkImage          image
 *     }
 * 
 *     Valid pNext types:
 *         - VkImagePlaneMemoryRequirementsInfo
 */
@JvmInline
value class ImageMemoryRequirementsInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}