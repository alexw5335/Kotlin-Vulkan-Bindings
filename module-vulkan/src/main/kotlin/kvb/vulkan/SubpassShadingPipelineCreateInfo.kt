// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_HUAWEI_subpass_shading

 *     struct VkSubpassShadingPipelineCreateInfoHUAWEI {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkRenderPass     renderPass
 *         uint32_t         subpass
 *     }
 */
@JvmInline
value class SubpassShadingPipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var subpass: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}