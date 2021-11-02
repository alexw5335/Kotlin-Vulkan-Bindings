// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSurfaceCapabilities2EXT {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         uint32_t                       minImageCount
 *         uint32_t                       maxImageCount
 *         VkExtent2D                     currentExtent
 *         VkExtent2D                     minImageExtent
 *         VkExtent2D                     maxImageExtent
 *         uint32_t                       maxImageArrayLayers
 *         VkSurfaceTransformFlagsKHR     supportedTransforms
 *         VkSurfaceTransformFlagBitsKHR  currentTransform
 *         VkCompositeAlphaFlagsKHR       supportedCompositeAlpha
 *         VkImageUsageFlags              supportedUsageFlags
 *         VkSurfaceCounterFlagsEXT       supportedSurfaceCounters
 *     }
 */
@JvmInline
value class SurfaceCapabilities2EXT(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxImageCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var currentExtent: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var minImageExtent: Extent2D
		get()      = Extent2D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 8)
	
	var maxImageExtent: Extent2D
		get()      = Extent2D(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 8)
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var currentTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	var supportedCompositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var supportedUsageFlags: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 64))
		set(value) = Unsafe.setInt(address + 64, value.value)
	
	var supportedSurfaceCounters: SurfaceCounterFlags
		get()      = SurfaceCounterFlags(Unsafe.getInt(address + 68))
		set(value) = Unsafe.setInt(address + 68, value.value)


}