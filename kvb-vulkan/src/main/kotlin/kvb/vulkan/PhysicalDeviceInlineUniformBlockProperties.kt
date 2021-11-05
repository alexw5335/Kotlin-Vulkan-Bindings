// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceInlineUniformBlockPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxInlineUniformBlockSize
 *         uint32_t         maxPerStageDescriptorInlineUniformBlocks
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks
 *         uint32_t         maxDescriptorSetInlineUniformBlocks
 *         uint32_t         maxDescriptorSetUpdateAfterBindInlineUniformBlocks
 *     }
 */
@JvmInline
value class PhysicalDeviceInlineUniformBlockProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxInlineUniformBlockSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxPerStageDescriptorInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var maxDescriptorSetInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var maxDescriptorSetUpdateAfterBindInlineUniformBlocks: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}