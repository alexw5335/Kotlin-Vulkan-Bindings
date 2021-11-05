// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer
import kvb.core.memory.direct.DirectLongBuffer

/**
 *     struct VkPresentInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext
 *         uint32_t         waitSemaphoreCount
 *         VkSemaphore*     pWaitSemaphores
 *         uint32_t         swapchainCount
 *         VkSwapchainKHR*  pSwapchains
 *         uint32_t*        pImageIndices
 *         VkResult*        pResults
 *     }
 * 
 *     Valid pNext types:
 *         - VkDisplayPresentInfoKHR
 *         - VkPresentRegionsKHR
 *         - VkDeviceGroupPresentInfoKHR
 *         - VkPresentTimesInfoGOOGLE
 *         - VkPresentFrameTokenGGP
 */
@JvmInline
value class PresentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSwapchains: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pImageIndices: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pResults: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var waitSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var swapchains: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), swapchainCount)
		set(value) { Unsafe.setLong(address + 40, value.address); swapchainCount = value.capacity }
	
	var imageIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 48), swapchainCount)
		set(value) { Unsafe.setLong(address + 48, value.address); swapchainCount = value.capacity }
	
	var results: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 56), swapchainCount)
		set(value) { Unsafe.setLong(address + 56, value.address); swapchainCount = value.capacity }


}