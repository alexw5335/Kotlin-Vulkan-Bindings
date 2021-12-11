// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         uint64_t              drmFormatModifier
 *         uint32_t              drmFormatModifierPlaneCount
 *         VkSubresourceLayout*  pPlaneLayouts
 *     }
 */
@JvmInline
value class ImageDrmFormatModifierExplicitCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var drmFormatModifierPlaneCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pPlaneLayouts: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var planeLayouts: SubresourceLayout.Buffer
		get()      = SubresourceLayout.Buffer(Unsafe.getLong(address + 32), drmFormatModifierPlaneCount)
		set(value) { Unsafe.setLong(address + 32, value.address); drmFormatModifierPlaneCount = value.capacity }


}