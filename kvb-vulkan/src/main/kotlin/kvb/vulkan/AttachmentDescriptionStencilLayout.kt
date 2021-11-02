// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
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
		get()      = ImageLayout.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilFinalLayout: ImageLayout
		get()      = ImageLayout.values().first { it.value == Unsafe.getInt(address + 20) }
		set(value) = Unsafe.setInt(address + 20, value.value)


}