// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAccelerationStructureVersionInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint8_t*         pVersionData
 *     }
 */
@JvmInline
value class AccelerationStructureVersionInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pVersionData: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var versionData: DirectByteBuffer
		get()      = DirectByteBuffer(Unsafe.getLong(address + 16), 32)
		set(value) { Unsafe.setLong(address + 16, value.address) }


}