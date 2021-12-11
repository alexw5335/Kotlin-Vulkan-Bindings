// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDisplayPlaneCapabilitiesKHR {
 *         VkDisplayPlaneAlphaFlagsKHR  supportedAlpha
 *         VkOffset2D                   minSrcPosition
 *         VkOffset2D                   maxSrcPosition
 *         VkExtent2D                   minSrcExtent
 *         VkExtent2D                   maxSrcExtent
 *         VkOffset2D                   minDstPosition
 *         VkOffset2D                   maxDstPosition
 *         VkExtent2D                   minDstExtent
 *         VkExtent2D                   maxDstExtent
 *     }
 */
@JvmInline
value class DisplayPlaneCapabilities(override val address: Long) : Addressable {
	
	
	var supportedAlpha: DisplayPlaneAlphaFlags
		get()      = DisplayPlaneAlphaFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var minSrcPosition: Offset2D
		get()      = Offset2D(address + 4)
		set(value) = Unsafe.copy(value.address, address + 4, 8)
	
	var maxSrcPosition: Offset2D
		get()      = Offset2D(address + 12)
		set(value) = Unsafe.copy(value.address, address + 12, 8)
	
	var minSrcExtent: Extent2D
		get()      = Extent2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var maxSrcExtent: Extent2D
		get()      = Extent2D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 8)
	
	var minDstPosition: Offset2D
		get()      = Offset2D(address + 36)
		set(value) = Unsafe.copy(value.address, address + 36, 8)
	
	var maxDstPosition: Offset2D
		get()      = Offset2D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 8)
	
	var minDstExtent: Extent2D
		get()      = Extent2D(address + 52)
		set(value) = Unsafe.copy(value.address, address + 52, 8)
	
	var maxDstExtent: Extent2D
		get()      = Extent2D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 8)


}