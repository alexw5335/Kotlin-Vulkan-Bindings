// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkCopyAccelerationStructureToMemoryInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkAccelerationStructureKHR          src
 *         VkDeviceOrHostAddressKHR            dst
 *         VkCopyAccelerationStructureModeKHR  mode
 *     }
 */
@JvmInline
value class CopyAccelerationStructureToMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var src: AccelerationStructureKHRH
		get()      = AccelerationStructureKHRH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dst: DeviceOrHostAddress
		get()      = DeviceOrHostAddress(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var mode: CopyAccelerationStructureMode
		get()      = _CopyAccelerationStructureMode(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}