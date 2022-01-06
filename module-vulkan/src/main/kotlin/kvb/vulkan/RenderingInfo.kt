// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     struct VkRenderingInfoKHR {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkRenderingFlagsKHR            flags
 *         VkRect2D                       renderArea
 *         uint32_t                       layerCount
 *         uint32_t                       viewMask
 *         uint32_t                       colorAttachmentCount
 *         VkRenderingAttachmentInfoKHR*  pColorAttachments
 *         VkRenderingAttachmentInfoKHR*  pDepthAttachment
 *         VkRenderingAttachmentInfoKHR*  pStencilAttachment
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupRenderPassBeginInfo
 *         - VkRenderingFragmentShadingRateAttachmentInfoKHR
 *         - VkRenderingFragmentDensityMapAttachmentInfoEXT
 *         - VkMultiviewPerViewAttributesInfoNVX
 */
@JvmInline
value class RenderingInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: RenderingFlags
		get()      = RenderingFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var renderArea: Rect2D
		get()      = Rect2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 16)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var viewMask: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var pColorAttachments: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pDepthAttachment: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pStencilAttachment: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var colorAttachments: RenderingAttachmentInfo.Buffer
		get()      = RenderingAttachmentInfo.Buffer(Unsafe.getLong(address + 48), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 48, value.address); colorAttachmentCount = value.capacity }
	
	var depthAttachment: RenderingAttachmentInfo
		get()      = RenderingAttachmentInfo(Unsafe.getLong(address + 56))
		set(value) { Unsafe.setLong(address + 56, value.address) }
	
	var stencilAttachment: RenderingAttachmentInfo
		get()      = RenderingAttachmentInfo(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }


}