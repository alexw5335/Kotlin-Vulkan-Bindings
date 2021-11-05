// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkDescriptorSetLayoutCreateInfo {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkDescriptorSetLayoutCreateFlags  flags
 *         uint32_t                          bindingCount
 *         VkDescriptorSetLayoutBinding*     pBindings
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorSetLayoutBindingFlagsCreateInfo
 *         - VkMutableDescriptorTypeCreateInfoVALVE
 */
@JvmInline
value class DescriptorSetLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DescriptorSetLayoutCreateFlags
		get()      = DescriptorSetLayoutCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var bindingCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pBindings: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var bindings: DescriptorSetLayoutBinding.Buffer
		get()      = DescriptorSetLayoutBinding.Buffer(Unsafe.getLong(address + 24), bindingCount)
		set(value) { Unsafe.setLong(address + 24, value.address); bindingCount = value.capacity }


}