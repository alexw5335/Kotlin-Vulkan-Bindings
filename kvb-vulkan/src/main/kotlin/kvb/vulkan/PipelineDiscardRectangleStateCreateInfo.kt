// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPipelineDiscardRectangleStateCreateInfoEXT {
 *         VkStructureType                                sType
 *         void*                                          pNext (must be null)
 *         VkPipelineDiscardRectangleStateCreateFlagsEXT  flags (reserved, must be zero)
 *         VkDiscardRectangleModeEXT                      discardRectangleMode
 *         uint32_t                                       discardRectangleCount
 *         VkRect2D*                                      pDiscardRectangles
 *     }
 */
@JvmInline
value class PipelineDiscardRectangleStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var discardRectangleMode: DiscardRectangleMode
		get()      = _DiscardRectangleMode(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var discardRectangleCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pDiscardRectangles: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var discardRectangles: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 32), discardRectangleCount)
		set(value) { Unsafe.setLong(address + 32, value.address); discardRectangleCount = value.capacity }


}