// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         descriptorSetCount
 *         uint32_t*        pDescriptorCounts
 *     }
 */
@JvmInline
value class DescriptorSetVariableDescriptorCountAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var descriptorSetCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDescriptorCounts: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var descriptorCounts: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), descriptorSetCount)
		set(value) { Unsafe.setLong(address + 24, value.address); descriptorSetCount = value.capacity }


}