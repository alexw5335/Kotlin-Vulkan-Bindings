// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCommandBufferInheritanceInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkRenderPass                   renderPass
 *         uint32_t                       subpass
 *         VkFramebuffer                  framebuffer
 *         VkBool32                       occlusionQueryEnable
 *         VkQueryControlFlags            queryFlags
 *         VkQueryPipelineStatisticFlags  pipelineStatistics
 *     }
 * 
 *     Valid pNext types:
 *         - VkCommandBufferInheritanceConditionalRenderingInfoEXT
 *         - VkCommandBufferInheritanceRenderPassTransformInfoQCOM
 */
@JvmInline
value class CommandBufferInheritanceInfo(override val address: Long) : Addressable {
	
	
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
	
	var framebuffer: FramebufferH
		get()      = FramebufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var occlusionQueryEnable: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var queryFlags: QueryControlFlags
		get()      = QueryControlFlags(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var pipelineStatistics: QueryPipelineStatisticFlags
		get()      = QueryPipelineStatisticFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)


}