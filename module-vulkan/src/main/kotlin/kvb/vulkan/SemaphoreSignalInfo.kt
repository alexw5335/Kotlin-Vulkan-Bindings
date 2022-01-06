// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkSemaphoreSignalInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSemaphore      semaphore
 *         uint64_t         value
 *     }
 */
@JvmInline
value class SemaphoreSignalInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var value: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}