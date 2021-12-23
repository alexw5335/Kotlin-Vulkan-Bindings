// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkGraphicsPipelineCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkPipelineCreateFlags                    flags
 *         uint32_t                                 stageCount
 *         VkPipelineShaderStageCreateInfo*         pStages
 *         VkPipelineVertexInputStateCreateInfo*    pVertexInputState
 *         VkPipelineInputAssemblyStateCreateInfo*  pInputAssemblyState
 *         VkPipelineTessellationStateCreateInfo*   pTessellationState
 *         VkPipelineViewportStateCreateInfo*       pViewportState
 *         VkPipelineRasterizationStateCreateInfo*  pRasterizationState
 *         VkPipelineMultisampleStateCreateInfo*    pMultisampleState
 *         VkPipelineDepthStencilStateCreateInfo*   pDepthStencilState
 *         VkPipelineColorBlendStateCreateInfo*     pColorBlendState
 *         VkPipelineDynamicStateCreateInfo*        pDynamicState
 *         VkPipelineLayout                         layout
 *         VkRenderPass                             renderPass
 *         uint32_t                                 subpass
 *         VkPipeline                               basePipelineHandle
 *         int32_t                                  basePipelineIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkGraphicsPipelineShaderGroupsCreateInfoNV
 *         - VkPipelineDiscardRectangleStateCreateInfoEXT
 *         - VkPipelineRepresentativeFragmentTestStateCreateInfoNV
 *         - VkPipelineCreationFeedbackCreateInfoEXT
 *         - VkPipelineCompilerControlCreateInfoAMD
 *         - VkPipelineFragmentShadingRateStateCreateInfoKHR
 *         - VkPipelineFragmentShadingRateEnumStateCreateInfoNV
 */
@JvmInline
value class GraphicsPipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stageCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pStages: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pVertexInputState: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pInputAssemblyState: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pTessellationState: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pViewportState: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pRasterizationState: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var pMultisampleState: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var pDepthStencilState: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	var pColorBlendState: Long
		get()      = Unsafe.getLong(address + 88)
		set(value) = Unsafe.setLong(address + 88, value)
	
	var pDynamicState: Long
		get()      = Unsafe.getLong(address + 96)
		set(value) = Unsafe.setLong(address + 96, value)
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 104))
		set(value) = Unsafe.setLong(address + 104, value.address)
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getLong(address + 112))
		set(value) = Unsafe.setLong(address + 112, value.address)
	
	var subpass: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 128))
		set(value) = Unsafe.setLong(address + 128, value.address)
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getLong(address + 24), stageCount)
		set(value) { Unsafe.setLong(address + 24, value.address); stageCount = value.capacity }
	
	var vertexInputState: PipelineVertexInputStateCreateInfo
		get()      = PipelineVertexInputStateCreateInfo(Unsafe.getLong(address + 32))
		set(value) { Unsafe.setLong(address + 32, value.address) }
	
	var inputAssemblyState: PipelineInputAssemblyStateCreateInfo
		get()      = PipelineInputAssemblyStateCreateInfo(Unsafe.getLong(address + 40))
		set(value) { Unsafe.setLong(address + 40, value.address) }
	
	var tessellationState: PipelineTessellationStateCreateInfo
		get()      = PipelineTessellationStateCreateInfo(Unsafe.getLong(address + 48))
		set(value) { Unsafe.setLong(address + 48, value.address) }
	
	var viewportState: PipelineViewportStateCreateInfo
		get()      = PipelineViewportStateCreateInfo(Unsafe.getLong(address + 56))
		set(value) { Unsafe.setLong(address + 56, value.address) }
	
	var rasterizationState: PipelineRasterizationStateCreateInfo
		get()      = PipelineRasterizationStateCreateInfo(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }
	
	var multisampleState: PipelineMultisampleStateCreateInfo
		get()      = PipelineMultisampleStateCreateInfo(Unsafe.getLong(address + 72))
		set(value) { Unsafe.setLong(address + 72, value.address) }
	
	var depthStencilState: PipelineDepthStencilStateCreateInfo
		get()      = PipelineDepthStencilStateCreateInfo(Unsafe.getLong(address + 80))
		set(value) { Unsafe.setLong(address + 80, value.address) }
	
	var colorBlendState: PipelineColorBlendStateCreateInfo
		get()      = PipelineColorBlendStateCreateInfo(Unsafe.getLong(address + 88))
		set(value) { Unsafe.setLong(address + 88, value.address) }
	
	var dynamicState: PipelineDynamicStateCreateInfo
		get()      = PipelineDynamicStateCreateInfo(Unsafe.getLong(address + 96))
		set(value) { Unsafe.setLong(address + 96, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 144
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = GraphicsPipelineCreateInfo(offset(index))
		
		operator fun set(index: Int, value: GraphicsPipelineCreateInfo) = Unsafe.copy(value.address, offset(index), 144)
		
		inline fun forEach(block: (GraphicsPipelineCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (GraphicsPipelineCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, GraphicsPipelineCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}