// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_acceleration_structure

 *     struct VkCopyAccelerationStructureInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkAccelerationStructureKHR          src
 *         VkAccelerationStructureKHR          dst
 *         VkCopyAccelerationStructureModeKHR  mode
 *     }
 */
@JvmInline
value class CopyAccelerationStructureInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var src: VkAccelerationStructureKHRH
		get()      = VkAccelerationStructureKHRH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dst: VkAccelerationStructureKHRH
		get()      = VkAccelerationStructureKHRH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var mode: CopyAccelerationStructureMode
		get()      = _CopyAccelerationStructureMode(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}