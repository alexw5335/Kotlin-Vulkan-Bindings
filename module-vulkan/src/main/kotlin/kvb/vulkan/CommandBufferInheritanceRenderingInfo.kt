// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     struct VkCommandBufferInheritanceRenderingInfoKHR {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkRenderingFlagsKHR    flags
 *         uint32_t               viewMask
 *         uint32_t               colorAttachmentCount
 *         VkFormat*              pColorAttachmentFormats
 *         VkFormat               depthAttachmentFormat
 *         VkFormat               stencilAttachmentFormat
 *         VkSampleCountFlagBits  rasterizationSamples
 *     }
 */
@JvmInline
value class CommandBufferInheritanceRenderingInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: RenderingFlags
		get()      = RenderingFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pColorAttachmentFormats: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var depthAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var stencilAttachmentFormat: Format
		get()      = Format(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var rasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	
	
	var colorAttachmentFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 32), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); colorAttachmentCount = value.capacity }


}