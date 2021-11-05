// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectByteBuffer

/**
 *     struct VkPhysicalDeviceDriverProperties {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkDriverId            driverID
 *         char                  driverName[256]
 *         char                  driverInfo[256]
 *         VkConformanceVersion  conformanceVersion
 *     }
 */
@JvmInline
value class PhysicalDeviceDriverProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var driverID: DriverId
		get()      = _DriverId(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var driverName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var driverInfo: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 256)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var conformanceVersion: ConformanceVersion
		get()      = ConformanceVersion(address + 532)
		set(value) = Unsafe.copy(value.address, address + 532, 4)


}