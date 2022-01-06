// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkTimelineSemaphoreSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         waitSemaphoreValueCount
 *         uint64_t*        pWaitSemaphoreValues
 *         uint32_t         signalSemaphoreValueCount
 *         uint64_t*        pSignalSemaphoreValues
 *     }
 */
@JvmInline
value class TimelineSemaphoreSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreValueCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphoreValues: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var signalSemaphoreValueCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSignalSemaphoreValues: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var waitSemaphoreValues: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreValueCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreValueCount = value.capacity }
	
	var signalSemaphoreValues: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), signalSemaphoreValueCount)
		set(value) { Unsafe.setLong(address + 40, value.address); signalSemaphoreValueCount = value.capacity }


}