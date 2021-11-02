// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFramebufferCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkFramebufferCreateFlags  flags
 *         VkRenderPass              renderPass
 *         uint32_t                  attachmentCount
 *         VkImageView*              pAttachments
 *         uint32_t                  width
 *         uint32_t                  height
 *         uint32_t                  layers
 *     }
 * 
 *     Valid pNext types:
 *         - VkFramebufferAttachmentsCreateInfo
 */
@JvmInline
value class FramebufferCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: FramebufferCreateFlags
		get()      = FramebufferCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var width: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var layers: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	
	
	var attachments: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), attachmentCount)
		set(value) { Unsafe.setLong(address + 40, value.address); attachmentCount = value.capacity }


}