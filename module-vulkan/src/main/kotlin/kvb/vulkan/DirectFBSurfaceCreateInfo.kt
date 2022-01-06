// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_directfb_surface

 *     struct VkDirectFBSurfaceCreateInfoEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkDirectFBSurfaceCreateFlagsEXT  flags (reserved, must be zero)
 *         IDirectFB*                       dfb
 *         IDirectFBSurface*                surface
 *     }
 */
@JvmInline
value class DirectFBSurfaceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var dfb: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var surface: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}