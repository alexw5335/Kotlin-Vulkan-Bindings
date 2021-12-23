// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         uint32_t                            groupCount
 *         VkGraphicsShaderGroupCreateInfoNV*  pGroups
 *         uint32_t                            pipelineCount
 *         VkPipeline*                         pPipelines
 *     }
 */
@JvmInline
value class GraphicsPipelineShaderGroupsCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var groupCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pGroups: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pipelineCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pPipelines: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var groups: GraphicsShaderGroupCreateInfo.Buffer
		get()      = GraphicsShaderGroupCreateInfo.Buffer(Unsafe.getLong(address + 24), groupCount)
		set(value) { Unsafe.setLong(address + 24, value.address); groupCount = value.capacity }
	
	var pipelines: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), pipelineCount)
		set(value) { Unsafe.setLong(address + 40, value.address); pipelineCount = value.capacity }


}