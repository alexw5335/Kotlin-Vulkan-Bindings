// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkAllocationCallbacks {
 *         void*                                 pUserData
 *         PFN_vkAllocationFunction              pfnAllocation
 *         PFN_vkReallocationFunction            pfnReallocation
 *         PFN_vkFreeFunction                    pfnFree
 *         PFN_vkInternalAllocationNotification  pfnInternalAllocation
 *         PFN_vkInternalFreeNotification        pfnInternalFree
 *     }
 */
@JvmInline
value class AllocationCallbacks(override val address: Long) : Addressable {
	
	
	var pUserData: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var pfnAllocation: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pfnReallocation: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pfnFree: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pfnInternalAllocation: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pfnInternalFree: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)


}