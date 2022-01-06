// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_ANDROID_external_memory_android_hardware_buffer

 *     struct VkAndroidHardwareBufferUsageANDROID {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         androidHardwareBufferUsage
 *     }
 */
@JvmInline
value class AndroidHardwareBufferUsage(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var androidHardwareBufferUsage: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}