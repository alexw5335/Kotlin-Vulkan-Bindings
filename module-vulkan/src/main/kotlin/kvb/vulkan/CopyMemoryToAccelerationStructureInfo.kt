// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCopyMemoryToAccelerationStructureInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkDeviceOrHostAddressConstKHR       src
 *         VkAccelerationStructureKHR          dst
 *         VkCopyAccelerationStructureModeKHR  mode
 *     }
 */
@JvmInline
value class CopyMemoryToAccelerationStructureInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var src: DeviceOrHostAddressConst
		get()      = DeviceOrHostAddressConst(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var dst: AccelerationStructureKHRH
		get()      = AccelerationStructureKHRH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var mode: CopyAccelerationStructureMode
		get()      = _CopyAccelerationStructureMode(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}