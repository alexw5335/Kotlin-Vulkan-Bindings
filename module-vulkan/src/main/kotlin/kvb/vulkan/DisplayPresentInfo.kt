// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDisplayPresentInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkRect2D         srcRect
 *         VkRect2D         dstRect
 *         VkBool32         persistent
 *     }
 */
@JvmInline
value class DisplayPresentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcRect: Rect2D
		get()      = Rect2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var dstRect: Rect2D
		get()      = Rect2D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 16)
	
	var persistent: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)


}