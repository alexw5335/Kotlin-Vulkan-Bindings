// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDescriptorUpdateTemplateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkDescriptorUpdateTemplateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                               descriptorUpdateEntryCount
 *         VkDescriptorUpdateTemplateEntry*       pDescriptorUpdateEntries
 *         VkDescriptorUpdateTemplateType         templateType
 *         VkDescriptorSetLayout                  descriptorSetLayout
 *         VkPipelineBindPoint                    pipelineBindPoint
 *         VkPipelineLayout                       pipelineLayout
 *         uint32_t                               set
 *     }
 */
@JvmInline
value class DescriptorUpdateTemplateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var descriptorUpdateEntryCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pDescriptorUpdateEntries: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var templateType: DescriptorUpdateTemplateType
		get()      = _DescriptorUpdateTemplateType(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var descriptorSetLayout: DescriptorSetLayoutH
		get()      = DescriptorSetLayoutH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var pipelineLayout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getLong(address + 56))
		set(value) = Unsafe.setLong(address + 56, value.address)
	
	var set: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	
	
	var descriptorUpdateEntries: DescriptorUpdateTemplateEntry.Buffer
		get()      = DescriptorUpdateTemplateEntry.Buffer(Unsafe.getLong(address + 24), descriptorUpdateEntryCount)
		set(value) { Unsafe.setLong(address + 24, value.address); descriptorUpdateEntryCount = value.capacity }


}