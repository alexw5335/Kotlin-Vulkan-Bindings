// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_FUCHSIA_imagepipe_surface

 *     struct VkImagePipeSurfaceCreateInfoFUCHSIA {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkImagePipeSurfaceCreateFlagsFUCHSIA  flags (reserved, must be zero)
 *         zx_handle_t                           imagePipeHandle
 *     }
 */
@JvmInline
value class ImagePipeSurfaceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var imagePipeHandle: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}