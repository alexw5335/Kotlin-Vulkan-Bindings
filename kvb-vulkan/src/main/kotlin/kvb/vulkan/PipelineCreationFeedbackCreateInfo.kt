// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineCreationFeedbackCreateInfoEXT {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkPipelineCreationFeedbackEXT*  pPipelineCreationFeedback
 *         uint32_t                        pipelineStageCreationFeedbackCount
 *         VkPipelineCreationFeedbackEXT*  pPipelineStageCreationFeedbacks
 *     }
 */
@JvmInline
value class PipelineCreationFeedbackCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pPipelineCreationFeedback: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pipelineStageCreationFeedbackCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pPipelineStageCreationFeedbacks: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var pipelineCreationFeedback: PipelineCreationFeedback
		get()      = PipelineCreationFeedback(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }
	
	var pipelineStageCreationFeedbacks: PipelineCreationFeedback.Buffer
		get()      = PipelineCreationFeedback.Buffer(Unsafe.getLong(address + 32), pipelineStageCreationFeedbackCount)
		set(value) { Unsafe.setLong(address + 32, value.address); pipelineStageCreationFeedbackCount = value.capacity }


}