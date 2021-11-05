// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPipelineRasterizationStateStreamCreateInfoEXT {
 *         VkStructureType                                   sType
 *         void*                                             pNext (must be null)
 *         VkPipelineRasterizationStateStreamCreateFlagsEXT  flags (reserved, must be zero)
 *         uint32_t                                          rasterizationStream
 *     }
 */
@JvmInline
value class PipelineRasterizationStateStreamCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var rasterizationStream: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}