// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSemaphoreWaitInfo {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkSemaphoreWaitFlags  flags
 *         uint32_t              semaphoreCount
 *         VkSemaphore*          pSemaphores
 *         uint64_t*             pValues
 *     }
 */
@JvmInline
value class SemaphoreWaitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SemaphoreWaitFlags
		get()      = SemaphoreWaitFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var semaphoreCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pValues: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var semaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), semaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); semaphoreCount = value.capacity }
	
	var values: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), semaphoreCount)
		set(value) { Unsafe.setLong(address + 32, value.address); semaphoreCount = value.capacity }


}