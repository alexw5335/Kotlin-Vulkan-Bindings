// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDescriptorPoolCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext
 *         VkDescriptorPoolCreateFlags  flags
 *         uint32_t                     maxSets
 *         uint32_t                     poolSizeCount
 *         VkDescriptorPoolSize*        pPoolSizes
 *     }
 * 
 *     Valid pNext types:
 *         - VkDescriptorPoolInlineUniformBlockCreateInfoEXT
 *         - VkMutableDescriptorTypeCreateInfoVALVE
 */
@JvmInline
value class DescriptorPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DescriptorPoolCreateFlags
		get()      = DescriptorPoolCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var maxSets: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var poolSizeCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pPoolSizes: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var poolSizes: DescriptorPoolSize.Buffer
		get()      = DescriptorPoolSize.Buffer(Unsafe.getLong(address + 32), poolSizeCount)
		set(value) { Unsafe.setLong(address + 32, value.address); poolSizeCount = value.capacity }


}