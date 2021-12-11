// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAndroidHardwareBufferPropertiesANDROID {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkDeviceSize     allocationSize
 *         uint32_t         memoryTypeBits
 *     }
 * 
 *     Valid pNext types:
 *         - VkAndroidHardwareBufferFormatPropertiesANDROID
 */
@JvmInline
value class AndroidHardwareBufferProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var allocationSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var memoryTypeBits: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}