// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     struct VkPipelineRenderingCreateInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         viewMask
 *         uint32_t         colorAttachmentCount
 *         VkFormat*        pColorAttachmentFormats
 *         VkFormat         depthAttachmentFormat
 *         VkFormat         stencilAttachmentFormat
 *     }
 */
@JvmInline
value class PipelineRenderingCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pColorAttachmentFormats: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var depthAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var stencilAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	
	
	var colorAttachmentFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); colorAttachmentCount = value.capacity }


}