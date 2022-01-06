// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkRenderPassBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkRenderPass     renderPass
 *         VkFramebuffer    framebuffer
 *         VkRect2D         renderArea
 *         uint32_t         clearValueCount
 *         VkClearValue*    pClearValues
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupRenderPassBeginInfo
 *         - VkRenderPassSampleLocationsBeginInfoEXT
 *         - VkRenderPassAttachmentBeginInfo
 *         - VkRenderPassTransformBeginInfoQCOM
 */
@JvmInline
value class RenderPassBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var framebuffer: FramebufferH
		get()      = FramebufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var renderArea: Rect2D
		get()      = Rect2D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 16)
	
	var clearValueCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pClearValues: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var clearValues: ClearValue.Buffer
		get()      = ClearValue.Buffer(Unsafe.getLong(address + 56), clearValueCount)
		set(value) { Unsafe.setLong(address + 56, value.address); clearValueCount = value.capacity }


}