// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing

 *     struct VkRayTracingPipelineCreateInfoNV {
 *         VkStructureType                       sType
 *         void*                                 pNext
 *         VkPipelineCreateFlags                 flags
 *         uint32_t                              stageCount
 *         VkPipelineShaderStageCreateInfo*      pStages
 *         uint32_t                              groupCount
 *         VkRayTracingShaderGroupCreateInfoNV*  pGroups
 *         uint32_t                              maxRecursionDepth
 *         VkPipelineLayout                      layout
 *         VkPipeline                            basePipelineHandle
 *         int32_t                               basePipelineIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineCreationFeedbackCreateInfoEXT
 */
@JvmInline
value class VkRayTracingPipelineCreateInfoNV(override val address: Long) : Addressable {
	
	
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
	
	var groupCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pGroups: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var maxRecursionDepth: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 56))
		set(value) = Unsafe.setLong(address + 56, value.address)
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 64))
		set(value) = Unsafe.setLong(address + 64, value.address)
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getLong(address + 24), stageCount)
		set(value) { Unsafe.setLong(address + 24, value.address); stageCount = value.capacity }
	
	var groups: VkRayTracingShaderGroupCreateInfoNV.Buffer
		get()      = VkRayTracingShaderGroupCreateInfoNV.Buffer(Unsafe.getLong(address + 40), groupCount)
		set(value) { Unsafe.setLong(address + 40, value.address); groupCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 80
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VkRayTracingPipelineCreateInfoNV(offset(index))
		
		operator fun set(index: Int, value: VkRayTracingPipelineCreateInfoNV) = Unsafe.copy(value.address, offset(index), 80)
		
		inline fun forEach(block: (VkRayTracingPipelineCreateInfoNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VkRayTracingPipelineCreateInfoNV) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VkRayTracingPipelineCreateInfoNV) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}