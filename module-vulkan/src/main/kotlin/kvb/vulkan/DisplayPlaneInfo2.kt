// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_get_display_properties2

 *     struct VkDisplayPlaneInfo2KHR {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         VkDisplayModeKHR  mode
 *         uint32_t          planeIndex
 *     }
 */
@JvmInline
value class DisplayPlaneInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var mode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var planeIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}