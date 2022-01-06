// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_maintenance4

 *     struct VkDeviceImageMemoryRequirementsKHR {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageCreateInfo*     pCreateInfo
 *         VkImageAspectFlagBits  planeAspect
 *     }
 */
@JvmInline
value class DeviceImageMemoryRequirements(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pCreateInfo: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var planeAspect: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	
	
	var createInfo: ImageCreateInfo
		get()      = ImageCreateInfo(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }


}