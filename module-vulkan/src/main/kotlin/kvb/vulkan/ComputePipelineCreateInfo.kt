// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkComputePipelineCreateInfo {
 *         VkStructureType                  sType
 *         void*                            pNext
 *         VkPipelineCreateFlags            flags
 *         VkPipelineShaderStageCreateInfo  stage
 *         VkPipelineLayout                 layout
 *         VkPipeline                       basePipelineHandle
 *         int32_t                          basePipelineIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineCreationFeedbackCreateInfoEXT
 *         - VkPipelineCompilerControlCreateInfoAMD
 */
@JvmInline
value class ComputePipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stage: PipelineShaderStageCreateInfo
		get()      = PipelineShaderStageCreateInfo(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 48)
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 72))
		set(value) = Unsafe.setLong(address + 72, value.address)
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 80))
		set(value) = Unsafe.setLong(address + 80, value.address)
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ComputePipelineCreateInfo(offset(index))
		
		operator fun set(index: Int, value: ComputePipelineCreateInfo) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (ComputePipelineCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ComputePipelineCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ComputePipelineCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}