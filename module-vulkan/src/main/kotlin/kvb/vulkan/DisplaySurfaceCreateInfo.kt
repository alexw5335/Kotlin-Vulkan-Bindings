// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_display

 *     struct VkDisplaySurfaceCreateInfoKHR {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkDisplaySurfaceCreateFlagsKHR  flags (reserved, must be zero)
 *         VkDisplayModeKHR                displayMode
 *         uint32_t                        planeIndex
 *         uint32_t                        planeStackIndex
 *         VkSurfaceTransformFlagBitsKHR   transform
 *         float                           globalAlpha
 *         VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
 *         VkExtent2D                      imageExtent
 *     }
 */
@JvmInline
value class DisplaySurfaceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var displayMode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var planeIndex: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var planeStackIndex: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var transform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var globalAlpha: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var alphaMode: DisplayPlaneAlphaFlags
		get()      = DisplayPlaneAlphaFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var imageExtent: Extent2D
		get()      = Extent2D(address + 52)
		set(value) = Unsafe.copy(value.address, address + 52, 8)


}