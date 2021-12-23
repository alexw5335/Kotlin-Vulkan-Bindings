// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFramebufferAttachmentsCreateInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           attachmentImageInfoCount
 *         VkFramebufferAttachmentImageInfo*  pAttachmentImageInfos
 *     }
 */
@JvmInline
value class FramebufferAttachmentsCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var attachmentImageInfoCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAttachmentImageInfos: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var attachmentImageInfos: FramebufferAttachmentImageInfo.Buffer
		get()      = FramebufferAttachmentImageInfo.Buffer(Unsafe.getLong(address + 24), attachmentImageInfoCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentImageInfoCount = value.capacity }


}