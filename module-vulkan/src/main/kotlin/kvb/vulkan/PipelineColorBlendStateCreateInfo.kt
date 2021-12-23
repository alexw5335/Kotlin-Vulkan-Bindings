// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineColorBlendStateCreateInfo {
 *         VkStructureType                       sType
 *         void*                                 pNext
 *         VkPipelineColorBlendStateCreateFlags  flags (reserved, must be zero)
 *         VkBool32                              logicOpEnable
 *         VkLogicOp                             logicOp
 *         uint32_t                              attachmentCount
 *         VkPipelineColorBlendAttachmentState*  pAttachments
 *         float                                 blendConstants[4]
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineColorBlendAdvancedStateCreateInfoEXT
 */
@JvmInline
value class PipelineColorBlendStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var logicOpEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var logicOp: LogicOp
		get()      = _LogicOp(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var blendConstants: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 40, 4)
		set(value) = Unsafe.copy(value.address, address + 40, value.byteSize)
	
	
	
	var attachments: PipelineColorBlendAttachmentState.Buffer
		get()      = PipelineColorBlendAttachmentState.Buffer(Unsafe.getLong(address + 32), attachmentCount)
		set(value) { Unsafe.setLong(address + 32, value.address); attachmentCount = value.capacity }


}