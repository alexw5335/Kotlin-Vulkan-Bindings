// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_vertex_attribute_divisor

 *     struct VkPipelineVertexInputDivisorStateCreateInfoEXT {
 *         VkStructureType                             sType
 *         void*                                       pNext (must be null)
 *         uint32_t                                    vertexBindingDivisorCount
 *         VkVertexInputBindingDivisorDescriptionEXT*  pVertexBindingDivisors
 *     }
 */
@JvmInline
value class PipelineVertexInputDivisorStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var vertexBindingDivisorCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pVertexBindingDivisors: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var vertexBindingDivisors: VertexInputBindingDivisorDescription.Buffer
		get()      = VertexInputBindingDivisorDescription.Buffer(Unsafe.getLong(address + 24), vertexBindingDivisorCount)
		set(value) { Unsafe.setLong(address + 24, value.address); vertexBindingDivisorCount = value.capacity }


}