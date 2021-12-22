// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkBufferCreateInfo {
 *         VkStructureType      sType
 *         void*                pNext
 *         VkBufferCreateFlags  flags
 *         VkDeviceSize         size
 *         VkBufferUsageFlags   usage
 *         VkSharingMode        sharingMode
 *         uint32_t             queueFamilyIndexCount
 *         uint32_t*            pQueueFamilyIndices
 *     }
 * 
 *     Valid pNext types:
 *         - VkDedicatedAllocationBufferCreateInfoNV
 *         - VkExternalMemoryBufferCreateInfo
 *         - VkBufferOpaqueCaptureAddressCreateInfo
 *         - VkBufferDeviceAddressCreateInfoEXT
 */
@JvmInline
value class BufferCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: BufferCreateFlags
		get()      = BufferCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var usage: BufferUsageFlags
		get()      = BufferUsageFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var sharingMode: SharingMode
		get()      = _SharingMode(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 48), queueFamilyIndexCount)
		set(value) { Unsafe.setLong(address + 48, value.address); queueFamilyIndexCount = value.capacity }


}