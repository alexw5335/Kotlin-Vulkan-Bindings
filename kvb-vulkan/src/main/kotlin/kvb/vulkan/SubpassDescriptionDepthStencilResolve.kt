// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSubpassDescriptionDepthStencilResolve {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkResolveModeFlagBits    depthResolveMode
 *         VkResolveModeFlagBits    stencilResolveMode
 *         VkAttachmentReference2*  pDepthStencilResolveAttachment
 *     }
 */
@JvmInline
value class SubpassDescriptionDepthStencilResolve(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var depthResolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilResolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var pDepthStencilResolveAttachment: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var depthStencilResolveAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}