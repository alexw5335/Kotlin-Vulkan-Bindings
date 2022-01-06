// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_present_id

 *     struct VkPresentIdKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         swapchainCount
 *         uint64_t*        pPresentIds
 *     }
 */
@JvmInline
value class PresentId(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pPresentIds: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var presentIds: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), swapchainCount)
		set(value) { Unsafe.setLong(address + 24, value.address); swapchainCount = value.capacity }


}