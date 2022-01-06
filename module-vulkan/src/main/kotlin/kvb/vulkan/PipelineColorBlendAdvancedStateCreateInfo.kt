// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_blend_operation_advanced

 *     struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkBool32           srcPremultiplied
 *         VkBool32           dstPremultiplied
 *         VkBlendOverlapEXT  blendOverlap
 *     }
 */
@JvmInline
value class PipelineColorBlendAdvancedStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcPremultiplied: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var dstPremultiplied: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var blendOverlap: BlendOverlap
		get()      = _BlendOverlap(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}