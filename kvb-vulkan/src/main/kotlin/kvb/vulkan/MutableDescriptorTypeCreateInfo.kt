// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkMutableDescriptorTypeCreateInfoVALVE {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           mutableDescriptorTypeListCount
 *         VkMutableDescriptorTypeListVALVE*  pMutableDescriptorTypeLists
 *     }
 */
@JvmInline
value class MutableDescriptorTypeCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var mutableDescriptorTypeListCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pMutableDescriptorTypeLists: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var mutableDescriptorTypeLists: MutableDescriptorTypeList.Buffer
		get()      = MutableDescriptorTypeList.Buffer(Unsafe.getLong(address + 24), mutableDescriptorTypeListCount)
		set(value) { Unsafe.setLong(address + 24, value.address); mutableDescriptorTypeListCount = value.capacity }


}