// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceRobustness2PropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     robustStorageBufferAccessSizeAlignment
 *         VkDeviceSize     robustUniformBufferAccessSizeAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceRobustness2Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var robustStorageBufferAccessSizeAlignment: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var robustUniformBufferAccessSizeAlignment: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}