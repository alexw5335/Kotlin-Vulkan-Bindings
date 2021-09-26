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
 *     struct VkGraphicsShaderGroupCreateInfoNV {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         uint32_t                                stageCount
 *         VkPipelineShaderStageCreateInfo**       pStages
 *         VkPipelineVertexInputStateCreateInfo*   pVertexInputState
 *         VkPipelineTessellationStateCreateInfo*  pTessellationState
 *     }
 */
@JvmInline
value class GraphicsShaderGroupCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var stageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pStages: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var pVertexInputState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var pTessellationState: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), stageCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); stageCount = value.capacity }
	
	var vertexInputState: PipelineVertexInputStateCreateInfo
		get()      = PipelineVertexInputStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	var tessellationState: PipelineTessellationStateCreateInfo
		get()      = PipelineTessellationStateCreateInfo(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = GraphicsShaderGroupCreateInfoNV(offset(index))
		
		operator fun set(index: Int, value: GraphicsShaderGroupCreateInfoNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (GraphicsShaderGroupCreateInfoNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (GraphicsShaderGroupCreateInfoNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "GraphicsShaderGroupCreateInfoNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GraphicsShaderGroupCreateInfoNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = GraphicsShaderGroupCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GRAPHICS_SHADER_GROUP_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = GraphicsShaderGroupCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GRAPHICS_SHADER_GROUP_CREATE_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.GRAPHICS_SHADER_GROUP_CREATE_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.GRAPHICS_SHADER_GROUP_CREATE_INFO }
		}
	
	}


}