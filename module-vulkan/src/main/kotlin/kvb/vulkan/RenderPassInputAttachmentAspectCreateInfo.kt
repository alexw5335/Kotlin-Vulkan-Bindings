// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkRenderPassInputAttachmentAspectCreateInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           aspectReferenceCount
 *         VkInputAttachmentAspectReference*  pAspectReferences
 *     }
 */
@JvmInline
value class RenderPassInputAttachmentAspectCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var aspectReferenceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAspectReferences: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var aspectReferences: InputAttachmentAspectReference.Buffer
		get()      = InputAttachmentAspectReference.Buffer(Unsafe.getLong(address + 24), aspectReferenceCount)
		set(value) { Unsafe.setLong(address + 24, value.address); aspectReferenceCount = value.capacity }


}