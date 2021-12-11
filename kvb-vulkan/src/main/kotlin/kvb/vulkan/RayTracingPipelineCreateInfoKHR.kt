// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkRayTracingPipelineCreateInfoKHR {
 *         VkStructureType                              sType
 *         void*                                        pNext
 *         VkPipelineCreateFlags                        flags
 *         uint32_t                                     stageCount
 *         VkPipelineShaderStageCreateInfo*             pStages
 *         uint32_t                                     groupCount
 *         VkRayTracingShaderGroupCreateInfoKHR*        pGroups
 *         uint32_t                                     maxPipelineRayRecursionDepth
 *         VkPipelineLibraryCreateInfoKHR*              pLibraryInfo
 *         VkRayTracingPipelineInterfaceCreateInfoKHR*  pLibraryInterface
 *         VkPipelineDynamicStateCreateInfo*            pDynamicState
 *         VkPipelineLayout                             layout
 *         VkPipeline                                   basePipelineHandle
 *         int32_t                                      basePipelineIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineCreationFeedbackCreateInfoEXT
 */
@JvmInline
value class RayTracingPipelineCreateInfoKHR(override val address: Long) : Addressable {
	
	
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
	
	var maxPipelineRayRecursionDepth: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pLibraryInfo: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pLibraryInterface: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var pDynamicState: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 80))
		set(value) = Unsafe.setLong(address + 80, value.address)
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 88))
		set(value) = Unsafe.setLong(address + 88, value.address)
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getLong(address + 24), stageCount)
		set(value) { Unsafe.setLong(address + 24, value.address); stageCount = value.capacity }
	
	var groups: RayTracingShaderGroupCreateInfoKHR.Buffer
		get()      = RayTracingShaderGroupCreateInfoKHR.Buffer(Unsafe.getLong(address + 40), groupCount)
		set(value) { Unsafe.setLong(address + 40, value.address); groupCount = value.capacity }
	
	var libraryInfo: PipelineLibraryCreateInfo
		get()      = PipelineLibraryCreateInfo(Unsafe.getLong(address + 56))
		set(value) { Unsafe.setLong(address + 56, value.address) }
	
	var libraryInterface: RayTracingPipelineInterfaceCreateInfo
		get()      = RayTracingPipelineInterfaceCreateInfo(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }
	
	var dynamicState: PipelineDynamicStateCreateInfo
		get()      = PipelineDynamicStateCreateInfo(Unsafe.getLong(address + 72))
		set(value) { Unsafe.setLong(address + 72, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 104
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = RayTracingPipelineCreateInfoKHR(offset(index))
		
		operator fun set(index: Int, value: RayTracingPipelineCreateInfoKHR) = Unsafe.copy(value.address, offset(index), 104)
		
		inline fun forEach(block: (RayTracingPipelineCreateInfoKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RayTracingPipelineCreateInfoKHR) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, RayTracingPipelineCreateInfoKHR) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}