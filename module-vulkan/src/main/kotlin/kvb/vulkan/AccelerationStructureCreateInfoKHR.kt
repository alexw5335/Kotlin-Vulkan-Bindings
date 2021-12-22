// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAccelerationStructureCreateInfoKHR {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkAccelerationStructureCreateFlagsKHR  createFlags
 *         VkBuffer                               buffer
 *         VkDeviceSize                           offset
 *         VkDeviceSize                           size
 *         VkAccelerationStructureTypeKHR         type
 *         VkDeviceAddress                        deviceAddress
 *     }
 */
@JvmInline
value class AccelerationStructureCreateInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var createFlags: AccelerationStructureCreateFlags
		get()      = AccelerationStructureCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var type: AccelerationStructureType
		get()      = _AccelerationStructureType(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var deviceAddress: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)


}