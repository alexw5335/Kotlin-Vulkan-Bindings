// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCopyBufferInfo2KHR {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkBuffer           srcBuffer
 *         VkBuffer           dstBuffer
 *         uint32_t           regionCount
 *         VkBufferCopy2KHR*  pRegions
 *     }
 */
@JvmInline
value class CopyBufferInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dstBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var regions: BufferCopy2.Buffer
		get()      = BufferCopy2.Buffer(Unsafe.getLong(address + 40), regionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); regionCount = value.capacity }


}