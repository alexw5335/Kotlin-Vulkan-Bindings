// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_color_write_enable

 *     struct VkPipelineColorWriteCreateInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         attachmentCount
 *         VkBool32*        pColorWriteEnables
 *     }
 */
@JvmInline
value class PipelineColorWriteCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pColorWriteEnables: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var colorWriteEnables: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), attachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentCount = value.capacity }


}