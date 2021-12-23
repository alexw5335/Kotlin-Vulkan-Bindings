// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineDepthStencilStateCreateInfo {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         VkPipelineDepthStencilStateCreateFlags  flags (reserved, must be zero)
 *         VkBool32                                depthTestEnable
 *         VkBool32                                depthWriteEnable
 *         VkCompareOp                             depthCompareOp
 *         VkBool32                                depthBoundsTestEnable
 *         VkBool32                                stencilTestEnable
 *         VkStencilOpState                        front
 *         VkStencilOpState                        back
 *         float                                   minDepthBounds
 *         float                                   maxDepthBounds
 *     }
 */
@JvmInline
value class PipelineDepthStencilStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var depthTestEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var depthWriteEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var depthCompareOp: CompareOp
		get()      = _CompareOp(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var depthBoundsTestEnable: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var stencilTestEnable: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var front: StencilOpState
		get()      = StencilOpState(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 28)
	
	var back: StencilOpState
		get()      = StencilOpState(address + 68)
		set(value) = Unsafe.copy(value.address, address + 68, 28)
	
	var minDepthBounds: Float
		get()      = Unsafe.getFloat(address + 96)
		set(value) = Unsafe.setFloat(address + 96, value)
	
	var maxDepthBounds: Float
		get()      = Unsafe.getFloat(address + 100)
		set(value) = Unsafe.setFloat(address + 100, value)


}