// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSurfaceCapabilitiesKHR {
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
 *     }
 */
@JvmInline
value class SurfaceCapabilities(override val address: Long) : Addressable {
	
	
	var minImageCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var maxImageCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var currentExtent: Extent2D
		get()      = Extent2D(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 8)
	
	var minImageExtent: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var maxImageExtent: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var currentTransform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var supportedCompositeAlpha: CompositeAlphaFlags
		get()      = CompositeAlphaFlags(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var supportedUsageFlags: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)


}