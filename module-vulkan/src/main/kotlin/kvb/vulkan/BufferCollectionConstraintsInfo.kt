// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_FUCHSIA_buffer_collection

 *     struct VkBufferCollectionConstraintsInfoFUCHSIA {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         minBufferCount
 *         uint32_t         maxBufferCount
 *         uint32_t         minBufferCountForCamping
 *         uint32_t         minBufferCountForDedicatedSlack
 *         uint32_t         minBufferCountForSharedSlack
 *     }
 */
@JvmInline
value class BufferCollectionConstraintsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minBufferCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxBufferCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var minBufferCountForCamping: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var minBufferCountForDedicatedSlack: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var minBufferCountForSharedSlack: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}