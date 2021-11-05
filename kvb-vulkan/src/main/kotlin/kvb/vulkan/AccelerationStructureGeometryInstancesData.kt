// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkAccelerationStructureGeometryInstancesDataKHR {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkBool32                       arrayOfPointers
 *         VkDeviceOrHostAddressConstKHR  data
 *     }
 */
@JvmInline
value class AccelerationStructureGeometryInstancesData(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var arrayOfPointers: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var data: DeviceOrHostAddressConst
		get()      = DeviceOrHostAddressConst(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)


}