// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkImageFormatListCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         viewFormatCount
 *         VkFormat*        pViewFormats
 *     }
 */
@JvmInline
value class ImageFormatListCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var viewFormatCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pViewFormats: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var viewFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), viewFormatCount)
		set(value) { Unsafe.setLong(address + 24, value.address); viewFormatCount = value.capacity }


}