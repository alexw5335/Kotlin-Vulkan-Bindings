// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkAttachmentDescriptionStencilLayout {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImageLayout    stencilInitialLayout
 *         VkImageLayout    stencilFinalLayout
 *     }
 */
@JvmInline
value class AttachmentDescriptionStencilLayout(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stencilInitialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilFinalLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)


}