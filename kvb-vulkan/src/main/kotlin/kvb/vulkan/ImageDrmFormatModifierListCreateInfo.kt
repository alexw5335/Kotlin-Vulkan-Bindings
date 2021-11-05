// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLongBuffer

/**
 *     struct VkImageDrmFormatModifierListCreateInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         drmFormatModifierCount
 *         uint64_t*        pDrmFormatModifiers
 *     }
 */
@JvmInline
value class ImageDrmFormatModifierListCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var drmFormatModifierCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDrmFormatModifiers: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var drmFormatModifiers: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), drmFormatModifierCount)
		set(value) { Unsafe.setLong(address + 24, value.address); drmFormatModifierCount = value.capacity }


}