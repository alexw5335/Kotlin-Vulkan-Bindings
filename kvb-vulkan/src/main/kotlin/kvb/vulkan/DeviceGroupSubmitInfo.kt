// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkDeviceGroupSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         waitSemaphoreCount
 *         uint32_t*        pWaitSemaphoreDeviceIndices
 *         uint32_t         commandBufferCount
 *         uint32_t*        pCommandBufferDeviceMasks
 *         uint32_t         signalSemaphoreCount
 *         uint32_t*        pSignalSemaphoreDeviceIndices
 *     }
 */
@JvmInline
value class DeviceGroupSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphoreDeviceIndices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pCommandBufferDeviceMasks: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pSignalSemaphoreDeviceIndices: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var waitSemaphoreDeviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var commandBufferDeviceMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), commandBufferCount)
		set(value) { Unsafe.setLong(address + 40, value.address); commandBufferCount = value.capacity }
	
	var signalSemaphoreDeviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 56), signalSemaphoreCount)
		set(value) { Unsafe.setLong(address + 56, value.address); signalSemaphoreCount = value.capacity }


}