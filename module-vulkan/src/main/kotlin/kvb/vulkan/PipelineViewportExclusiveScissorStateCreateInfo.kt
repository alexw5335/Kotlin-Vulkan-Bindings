// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineViewportExclusiveScissorStateCreateInfoNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         exclusiveScissorCount
 *         VkRect2D*        pExclusiveScissors
 *     }
 */
@JvmInline
value class PipelineViewportExclusiveScissorStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var exclusiveScissorCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pExclusiveScissors: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var exclusiveScissors: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 24), exclusiveScissorCount)
		set(value) { Unsafe.setLong(address + 24, value.address); exclusiveScissorCount = value.capacity }


}