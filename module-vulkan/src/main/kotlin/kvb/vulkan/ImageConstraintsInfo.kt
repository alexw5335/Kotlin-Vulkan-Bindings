// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_FUCHSIA_buffer_collection

 *     struct VkImageConstraintsInfoFUCHSIA {
 *         VkStructureType                           sType
 *         void*                                     pNext (must be null)
 *         uint32_t                                  formatConstraintsCount
 *         VkImageFormatConstraintsInfoFUCHSIA*      pFormatConstraints
 *         VkBufferCollectionConstraintsInfoFUCHSIA  bufferCollectionConstraints
 *         VkImageConstraintsInfoFlagsFUCHSIA        flags
 *     }
 */
@JvmInline
value class ImageConstraintsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var formatConstraintsCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pFormatConstraints: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var bufferCollectionConstraints: BufferCollectionConstraintsInfo
		get()      = BufferCollectionConstraintsInfo(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 40)
	
	var flags: ImageConstraintsInfoFlags
		get()      = ImageConstraintsInfoFlags(Unsafe.getInt(address + 72))
		set(value) = Unsafe.setInt(address + 72, value.value)
	
	
	
	var formatConstraints: ImageFormatConstraintsInfo.Buffer
		get()      = ImageFormatConstraintsInfo.Buffer(Unsafe.getLong(address + 24), formatConstraintsCount)
		set(value) { Unsafe.setLong(address + 24, value.address); formatConstraintsCount = value.capacity }


}