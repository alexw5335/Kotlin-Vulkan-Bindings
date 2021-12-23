// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDisplayModeCreateInfoKHR {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkDisplayModeCreateFlagsKHR  flags (reserved, must be zero)
 *         VkDisplayModeParametersKHR   parameters
 *     }
 */
@JvmInline
value class DisplayModeCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var parameters: DisplayModeParameters
		get()      = DisplayModeParameters(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 12)


}