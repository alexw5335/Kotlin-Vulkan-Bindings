// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_swapchain

 *     struct VkBindImageMemorySwapchainInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSwapchainKHR   swapchain
 *         uint32_t         imageIndex
 *     }
 */
@JvmInline
value class BindImageMemorySwapchainInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var swapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var imageIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}