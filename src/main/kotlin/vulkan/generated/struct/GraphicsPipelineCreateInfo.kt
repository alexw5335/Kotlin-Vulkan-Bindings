// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

/**
 *     struct VkGraphicsPipelineCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkPipelineCreateFlags                    flags
 *         uint32_t                                 stageCount
 *         VkPipelineShaderStageCreateInfo**        pStages
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
 */
@JvmInline
value class GraphicsPipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var stageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pStages: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var pVertexInputState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var pInputAssemblyState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var pTessellationState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	var pViewportState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	var pRasterizationState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	var pMultisampleState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[10], value) }
	
	var pDepthStencilState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value) }
	
	var pColorBlendState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[12], value) }
	
	var pDynamicState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value) }
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[14]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[14], value.address) }
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getNativePointer(address + LAYOUT.offsets[15]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[15], value.address) }
	
	var subpass: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getNativePointer(address + LAYOUT.offsets[17]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[17], value.address) }
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), stageCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); stageCount = value.capacity }
	
	var vertexInputState: PipelineVertexInputStateCreateInfo
		get()      = PipelineVertexInputStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	var inputAssemblyState: PipelineInputAssemblyStateCreateInfo
		get()      = PipelineInputAssemblyStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address) }
	
	var tessellationState: PipelineTessellationStateCreateInfo
		get()      = PipelineTessellationStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address) }
	
	var viewportState: PipelineViewportStateCreateInfo
		get()      = PipelineViewportStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address) }
	
	var rasterizationState: PipelineRasterizationStateCreateInfo
		get()      = PipelineRasterizationStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address) }
	
	var multisampleState: PipelineMultisampleStateCreateInfo
		get()      = PipelineMultisampleStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[10]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[10], value.address) }
	
	var depthStencilState: PipelineDepthStencilStateCreateInfo
		get()      = PipelineDepthStencilStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value.address) }
	
	var colorBlendState: PipelineColorBlendStateCreateInfo
		get()      = PipelineColorBlendStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[12]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[12], value.address) }
	
	var dynamicState: PipelineDynamicStateCreateInfo
		get()      = PipelineDynamicStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[13]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = GraphicsPipelineCreateInfo(offset(index))
		
		operator fun set(index: Int, value: GraphicsPipelineCreateInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (GraphicsPipelineCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (GraphicsPipelineCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "GraphicsPipelineCreateInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GraphicsPipelineCreateInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = GraphicsPipelineCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GRAPHICS_PIPELINE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = GraphicsPipelineCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GRAPHICS_PIPELINE_CREATE_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.GRAPHICS_PIPELINE_CREATE_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.GRAPHICS_PIPELINE_CREATE_INFO }
		}
	
	}


}