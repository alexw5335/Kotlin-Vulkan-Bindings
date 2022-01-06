// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkBindImageMemoryDeviceGroupInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceIndexCount
 *         uint32_t*        pDeviceIndices
 *         uint32_t         splitInstanceBindRegionCount
 *         VkRect2D*        pSplitInstanceBindRegions
 *     }
 */
@JvmInline
value class BindImageMemoryDeviceGroupInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceIndexCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDeviceIndices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var splitInstanceBindRegionCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSplitInstanceBindRegions: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var deviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), deviceIndexCount)
		set(value) { Unsafe.setLong(address + 24, value.address); deviceIndexCount = value.capacity }
	
	var splitInstanceBindRegions: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 40), splitInstanceBindRegionCount)
		set(value) { Unsafe.setLong(address + 40, value.address); splitInstanceBindRegionCount = value.capacity }


}