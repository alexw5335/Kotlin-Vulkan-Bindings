// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceExternalSemaphoreInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkExternalSemaphoreHandleTypeFlagBits  handleType
 *     }
 * 
 *     Valid pNext types:
 *         - VkSemaphoreTypeCreateInfo
 */
@JvmInline
value class PhysicalDeviceExternalSemaphoreInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleType: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}