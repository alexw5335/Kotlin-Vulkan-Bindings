// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkGeneratedCommandsMemoryRequirementsInfoNV {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkPipelineBindPoint         pipelineBindPoint
 *         VkPipeline                  pipeline
 *         VkIndirectCommandsLayoutNV  indirectCommandsLayout
 *         uint32_t                    maxSequencesCount
 *     }
 */
@JvmInline
value class GeneratedCommandsMemoryRequirementsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pipeline: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var indirectCommandsLayout: IndirectCommandsLayoutH
		get()      = IndirectCommandsLayoutH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var maxSequencesCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)


}