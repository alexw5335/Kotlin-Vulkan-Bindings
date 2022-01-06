// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0
 *
 *     struct VkPipelineLayoutCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkPipelineLayoutCreateFlags  flags (reserved, must be zero)
 *         uint32_t                     setLayoutCount
 *         VkDescriptorSetLayout*       pSetLayouts
 *         uint32_t                     pushConstantRangeCount
 *         VkPushConstantRange*         pPushConstantRanges
 *     }
 */
@JvmInline
value class PipelineLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var setLayoutCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pSetLayouts: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pushConstantRangeCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pPushConstantRanges: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var setLayouts: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), setLayoutCount)
		set(value) { Unsafe.setLong(address + 24, value.address); setLayoutCount = value.capacity }
	
	var pushConstantRanges: PushConstantRange.Buffer
		get()      = PushConstantRange.Buffer(Unsafe.getLong(address + 40), pushConstantRangeCount)
		set(value) { Unsafe.setLong(address + 40, value.address); pushConstantRangeCount = value.capacity }


}