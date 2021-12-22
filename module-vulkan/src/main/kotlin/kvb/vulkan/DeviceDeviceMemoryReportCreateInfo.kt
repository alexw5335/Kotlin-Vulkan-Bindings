// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDeviceDeviceMemoryReportCreateInfoEXT {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         VkDeviceMemoryReportFlagsEXT         flags (reserved, must be zero)
 *         PFN_vkDeviceMemoryReportCallbackEXT  pfnUserCallback
 *         void*                                pUserData
 *     }
 */
@JvmInline
value class DeviceDeviceMemoryReportCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pfnUserCallback: PFN_vkDeviceMemoryReportCallbackEXT
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pUserData: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}