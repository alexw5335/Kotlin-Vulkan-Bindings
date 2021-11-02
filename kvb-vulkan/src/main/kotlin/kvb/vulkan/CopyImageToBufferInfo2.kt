// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCopyImageToBufferInfo2KHR {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         VkImage                 srcImage
 *         VkImageLayout           srcImageLayout
 *         VkBuffer                dstBuffer
 *         uint32_t                regionCount
 *         VkBufferImageCopy2KHR*  pRegions
 *     }
 */
@JvmInline
value class CopyImageToBufferInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcImageLayout: ImageLayout
		get()      = ImageLayout.values().first { it.value == Unsafe.getInt(address + 24) }
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var regions: BufferImageCopy2.Buffer
		get()      = BufferImageCopy2.Buffer(Unsafe.getLong(address + 48), regionCount)
		set(value) { Unsafe.setLong(address + 48, value.address); regionCount = value.capacity }


}