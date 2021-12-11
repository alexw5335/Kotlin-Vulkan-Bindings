// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkGraphicsShaderGroupCreateInfoNV {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         uint32_t                                stageCount
 *         VkPipelineShaderStageCreateInfo*        pStages
 *         VkPipelineVertexInputStateCreateInfo*   pVertexInputState
 *         VkPipelineTessellationStateCreateInfo*  pTessellationState
 *     }
 */
@JvmInline
value class GraphicsShaderGroupCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stageCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pStages: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pVertexInputState: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pTessellationState: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getLong(address + 24), stageCount)
		set(value) { Unsafe.setLong(address + 24, value.address); stageCount = value.capacity }
	
	var vertexInputState: PipelineVertexInputStateCreateInfo
		get()      = PipelineVertexInputStateCreateInfo(Unsafe.getLong(address + 32))
		set(value) { Unsafe.setLong(address + 32, value.address) }
	
	var tessellationState: PipelineTessellationStateCreateInfo
		get()      = PipelineTessellationStateCreateInfo(Unsafe.getLong(address + 40))
		set(value) { Unsafe.setLong(address + 40, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = GraphicsShaderGroupCreateInfo(offset(index))
		
		operator fun set(index: Int, value: GraphicsShaderGroupCreateInfo) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (GraphicsShaderGroupCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (GraphicsShaderGroupCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, GraphicsShaderGroupCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}