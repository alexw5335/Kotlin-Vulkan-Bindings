// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPresentTimesInfoGOOGLE {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         uint32_t              swapchainCount
 *         VkPresentTimeGOOGLE*  pTimes
 *     }
 */
@JvmInline
value class PresentTimesInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pTimes: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var times: PresentTime.Buffer
		get()      = PresentTime.Buffer(Unsafe.getLong(address + 24), swapchainCount)
		set(value) { Unsafe.setLong(address + 24, value.address); swapchainCount = value.capacity }


}