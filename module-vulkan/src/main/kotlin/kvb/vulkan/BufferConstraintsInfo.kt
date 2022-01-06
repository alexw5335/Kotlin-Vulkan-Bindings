// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_FUCHSIA_buffer_collection

 *     struct VkBufferConstraintsInfoFUCHSIA {
 *         VkStructureType                           sType
 *         void*                                     pNext (must be null)
 *         VkBufferCreateInfo                        createInfo
 *         VkFormatFeatureFlags                      requiredFormatFeatures
 *         VkBufferCollectionConstraintsInfoFUCHSIA  bufferCollectionConstraints
 *     }
 */
@JvmInline
value class BufferConstraintsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var createInfo: BufferCreateInfo
		get()      = BufferCreateInfo(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 56)
	
	var requiredFormatFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 72))
		set(value) = Unsafe.setInt(address + 72, value.value)
	
	var bufferCollectionConstraints: BufferCollectionConstraintsInfo
		get()      = BufferCollectionConstraintsInfo(address + 80)
		set(value) = Unsafe.copy(value.address, address + 80, 40)


}