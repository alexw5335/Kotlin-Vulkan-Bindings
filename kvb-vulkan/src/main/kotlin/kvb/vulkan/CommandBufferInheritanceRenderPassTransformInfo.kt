// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkSurfaceTransformFlagBitsKHR  transform
 *         VkRect2D                       renderArea
 *     }
 */
@JvmInline
value class CommandBufferInheritanceRenderPassTransformInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var transform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var renderArea: Rect2D
		get()      = Rect2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 16)


}