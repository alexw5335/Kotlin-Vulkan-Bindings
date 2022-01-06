// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkDeviceGroupRenderPassBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceMask
 *         uint32_t         deviceRenderAreaCount
 *         VkRect2D*        pDeviceRenderAreas
 *     }
 */
@JvmInline
value class DeviceGroupRenderPassBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var deviceRenderAreaCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pDeviceRenderAreas: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var deviceRenderAreas: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 24), deviceRenderAreaCount)
		set(value) { Unsafe.setLong(address + 24, value.address); deviceRenderAreaCount = value.capacity }


}