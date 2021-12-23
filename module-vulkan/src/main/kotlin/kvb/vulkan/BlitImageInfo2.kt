// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkBlitImageInfo2KHR {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         VkImage           srcImage
 *         VkImageLayout     srcImageLayout
 *         VkImage           dstImage
 *         VkImageLayout     dstImageLayout
 *         uint32_t          regionCount
 *         VkImageBlit2KHR*  pRegions
 *         VkFilter          filter
 *     }
 */
@JvmInline
value class BlitImageInfo2(override val address: Long) : Addressable {
	
	
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
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstImage: ImageH
		get()      = ImageH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var pRegions: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var filter: Filter
		get()      = _Filter(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	
	
	var regions: ImageBlit2.Buffer
		get()      = ImageBlit2.Buffer(Unsafe.getLong(address + 48), regionCount)
		set(value) { Unsafe.setLong(address + 48, value.address); regionCount = value.capacity }


}