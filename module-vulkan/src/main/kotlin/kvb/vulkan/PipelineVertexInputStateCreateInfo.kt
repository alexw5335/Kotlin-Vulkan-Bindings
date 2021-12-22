// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineVertexInputStateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineVertexInputStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                               vertexBindingDescriptionCount
 *         VkVertexInputBindingDescription*       pVertexBindingDescriptions
 *         uint32_t                               vertexAttributeDescriptionCount
 *         VkVertexInputAttributeDescription*     pVertexAttributeDescriptions
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineVertexInputDivisorStateCreateInfoEXT
 */
@JvmInline
value class PipelineVertexInputStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var vertexBindingDescriptionCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pVertexBindingDescriptions: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var vertexAttributeDescriptionCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pVertexAttributeDescriptions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var vertexBindingDescriptions: VertexInputBindingDescription.Buffer
		get()      = VertexInputBindingDescription.Buffer(Unsafe.getLong(address + 24), vertexBindingDescriptionCount)
		set(value) { Unsafe.setLong(address + 24, value.address); vertexBindingDescriptionCount = value.capacity }
	
	var vertexAttributeDescriptions: VertexInputAttributeDescription.Buffer
		get()      = VertexInputAttributeDescription.Buffer(Unsafe.getLong(address + 40), vertexAttributeDescriptionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); vertexAttributeDescriptionCount = value.capacity }


}