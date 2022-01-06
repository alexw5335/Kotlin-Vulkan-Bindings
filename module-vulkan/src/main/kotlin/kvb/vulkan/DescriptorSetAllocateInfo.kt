// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkDescriptorSetAllocateInfo {
 *         VkStructureType         sType
 *         void*                   pNext
 *         VkDescriptorPool        descriptorPool
 *         uint32_t                descriptorSetCount
 *         VkDescriptorSetLayout*  pSetLayouts
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorSetVariableDescriptorCountAllocateInfo
 */
@JvmInline
value class DescriptorSetAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var descriptorPool: DescriptorPoolH
		get()      = DescriptorPoolH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var descriptorSetCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pSetLayouts: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var setLayouts: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), descriptorSetCount)
		set(value) { Unsafe.setLong(address + 32, value.address); descriptorSetCount = value.capacity }


}