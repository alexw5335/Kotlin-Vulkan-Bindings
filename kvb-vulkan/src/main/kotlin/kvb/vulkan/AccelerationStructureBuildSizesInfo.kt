// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkAccelerationStructureBuildSizesInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     accelerationStructureSize
 *         VkDeviceSize     updateScratchSize
 *         VkDeviceSize     buildScratchSize
 *     }
 */
@JvmInline
value class AccelerationStructureBuildSizesInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var accelerationStructureSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var updateScratchSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var buildScratchSize: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}